// Isi setiap ___ dengan type parameter, bound, atau wildcard yang tepat.
// Satu ___ bisa saja berisi tipe utuh, misalnya "T extends Task", "Node<T>", atau "? super T".
public class TaskQueue<T extends Task> {

    private static class Node<E> {
        private final E task;
        private Node<E> next;

        private Node(E task) {
            this.task = task;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;
    private final int capacity;

    public TaskQueue(int capacity) {
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Menambahkan task ke BELAKANG antrean
    // Mengembalikan false jika task null atau antrean sudah penuh (size sudah mencapai capacity),
    // selain itu true. Jangan lupa memperbarui head, tail, dan size.
    public boolean add(T task) {
        if (task == null || this.size >= this.capacity) return false;

        Node<T> newNode = new Node<>(task);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
        return true;
    }

    // Mencari node dengan priority terbesar. Jika sama, yang paling depan yang dipilih.
    private Node<T> bestNode() {
        Node<T> best = null;
        for (Node<T> cur = head; cur != null; cur = cur.next) {
            if (best == null || cur.task.getPriority() > best.task.getPriority()) {
                best = cur;
            }
        }
        return best;
    }

    // Mencari node tepat SEBELUM target. Jika target adalah head, hasilnya null.
    private Node<T> before(Node<T> target) {
        for (Node<T> cur = head; cur != null; cur = cur.next) {
            if (cur.next == target) {
                return cur;
            }
        }
        return null;
    }

    // Melihat task TERPENTING TANPA menghapusnya. Antrean kosong -> null.
    public T peek() {
        Node<T> best = bestNode();
        return best == null ? null : best.task;
    }

    // Seperti peek, tetapi node-nya dikeluarkan dari antrean. Antrean kosong -> null.
    // Petunjuk: gunakan bestNode dan before. Perhatikan kasus saat node yang dikeluarkan
    // adalah head, dan kasus saat node tersebut adalah tail.
    public T poll() {
        Node<T> best = bestNode();
        if (best == null) return null;

        if (best == this.head) {
            this.head = this.head.next;
            if (this.head == null) this.tail = null; // List menjadi kosong
        } else {
            Node<T> prev = before(best);
            prev.next = best.next;
            if (best == this.tail) this.tail = prev; // Jika yang dihapus adalah tail
        }

        this.size--;
        return best.task;
    }

    // Mengeluarkan SEMUA task (urutan seperti poll), menjalankan run() masing-masing,
    // lalu mengembalikan semua hasil run() digabung dengan pemisah " | " (spasi, garis tegak (pipe), spasi).
    // Contoh hasil: "Backing up 5 MB... | Sending email to a@x...". Antrean kosong -> "" (string kosong).
    public String runAll() {
        // TODO: Implementasikan runAll
        StringBuilder sb = new StringBuilder();
        T node_poll = poll();
        if (node_poll != null) {
          sb.append(node_poll.run());
        }
        node_poll = poll();
        while (node_poll != null) {
          sb.append(" | " + node_poll.run());
          node_poll = poll();
        }
        return sb.toString();
    }

    // Mengembalikan task pertama (menurut URUTAN MASUK) yang memenuhi condition,
    // tanpa menghapusnya. Tidak ada yang cocok -> null.
    // condition boleh berupa Condition untuk T atau supertype-nya.
    public T findFirst(Condition<? super T> condition) {
        Node<T> curr_node = this.head;
        while (curr_node != null) {
            if (condition.isMet(curr_node.task)) return curr_node.task;
            curr_node = curr_node.next;
        }
        return null;
    }

    // Mengembalikan task dengan duration TERBESAR dari queue. Jika sama, yang paling depan yang dipilih.
    // Tipe hasilnya harus sama dengan tipe isi queue. queue kosong -> null. Queue tidak boleh berubah.
    public static <E extends Task> E longest(TaskQueue<E> queue) {
        // TODO: Implementasikan longest
        if (queue == null || queue.head == null) return null;

        Node<E> max_node = queue.head;
        Node<E> curr_node = queue.head.next;
        while (curr_node != null) {
            if (max_node.task.getDuration() < curr_node.task.getDuration()) max_node = curr_node;
            curr_node = curr_node.next;
        }
        return max_node.task;
    }

    // Menjumlahkan duration semua task di queue tanpa mengubah queue.
    // queue boleh berisi Task atau subclass apa pun.
    public static int totalDuration(TaskQueue<? extends Task> queue) {
        int total = 0;
        for (Node<? extends Task> cur = queue.head; cur != null; cur = cur.next) {
            total += cur.task.getDuration();
        }
        return total;
    }

    // Memindahkan task ke target (urutan seperti poll) selama target masih bisa menerima.
    // Jika target penuh, berhenti. Task yang belum terpindah tetap berada di antrean ini.
    // target boleh berupa antrean yang menampung T atau supertype-nya.
    public void drainTo(TaskQueue<? super T> target) {
        while (!isEmpty()) {
            if (!target.add(peek())) {
                break;
            }
            poll();
        }
    }
}
