import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    // Dua Stack berbasis Deque. Elemen paling atas adalah elemen paling baru.
    private Deque<String> backStack = new ArrayDeque<>();      // halaman-halaman sebelumnya
    private Deque<String> forwardStack = new ArrayDeque<>();   // halaman-halaman yang bisa di-forward
    private String current;
    private int limit;                                         // batas isi backStack (limit >= 1)

    public BrowserHistory(String homepage, int limit) {
        this.current = homepage;
        this.limit = limit;
    }

    public String current() {
        return current;
    }

    public int backCount() {
        return backStack.size();
    }

    public int forwardCount() {
        return forwardStack.size();
    }

    // Buka halaman baru.
    public void visit(String page) {
        backStack.addLast(current);       // 1. Masukkan halaman saat ini ke backStack
        forwardStack.clear();             // 2. Kosongkan forwardStack
        this.current = page;              // 3. Update current menjadi halaman baru

        // 4. Jika melebihi limit, buang halaman paling lama (paling dasar)
        if (backStack.size() > limit) {
            backStack.removeFirst();
        }
    }

    // Kembali satu halaman.
    public String back() {
        if (backStack.isEmpty()) return current;

        forwardStack.addLast(current);            // Halaman saat ini masuk ke forwardStack
        this.current = backStack.removeLast();    // current mundur ke halaman dari backStack
        return current;
    }

    // Maju satu halaman.
    public String forward() {
        if (forwardStack.isEmpty()) return current;

        backStack.addLast(current);               // Halaman saat ini masuk ke backStack
        this.current = forwardStack.removeLast(); // current maju ke halaman dari forwardStack
        return current;
    }
}
