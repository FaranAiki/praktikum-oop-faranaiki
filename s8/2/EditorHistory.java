import java.util.ArrayDeque;
import java.util.Deque;

public class EditorHistory {
    // Dua tumpukan (stack) berbasis Deque. Elemen paling atas adalah elemen paling baru.
    private Deque<String> undoStack = new ArrayDeque<>();      // teks-teks sebelumnya
    private Deque<String> redoStack = new ArrayDeque<>();      // teks-teks yang bisa di-redo
    private String text;
    private int limit;                                         // batas isi undoStack (limit >= 1)

    public EditorHistory(String initial, int limit) {
        this.text = initial;
        this.limit = limit;
    }

    public String text() {
        return text;
    }

    public int undoCount() {
        return undoStack.size();
    }

    public int redoCount() {
        return redoStack.size();
    }

    // TODO: Ubah teks.
    // 1. Teks yang sedang aktif masuk ke undoStack (taruh di atas tumpukan).
    // 2. redoStack dikosongkan (history forward hilang saat mengedit teks).
    // 3. text menjadi content.
    // 4. Jika isi undoStack melebihi limit, buang teks PALING LAMA (yang ada di dasar tumpukan).
    // Petunjuk: baca dokumentasi Deque / ArrayDeque untuk method yang memperlakukannya sebagai stack,
    // serta method yang membuang elemen dari ujung yang berlawanan.
    public void edit(String content) {
        undoStack.addLast(text);
        redoStack.clear();
        this.text = content;
        if (undoStack.size() > limit) {
            undoStack.removeFirst();
        }
    }

    // TODO: Kembali satu teks.
    // Jika undoStack kosong, tidak ada yang berubah, kembalikan text.
    // Jika tidak, teks yang sedang aktif masuk ke redoStack, text menjadi teks teratas
    // undoStack (ambil dari tumpukan). Kembalikan text yang baru.
    public String undo() {
        if (undoStack.isEmpty()) return text;
        redoStack.addLast(text);
        this.text = undoStack.removeLast();
        return text;
    }

    // TODO: Maju satu teks. Kebalikan dari undo().
    // Jika redoStack kosong, tidak ada yang berubah, kembalikan text.
    // Jika tidak, teks yang sedang aktif masuk ke undoStack, text menjadi teks teratas
    // redoStack (ambil dari tumpukan). Kembalikan text yang baru.
    public String redo() {
        if (redoStack.isEmpty()) return text;
        undoStack.addLast(text);
        this.text = redoStack.removeLast();
        return text;
    }
}
