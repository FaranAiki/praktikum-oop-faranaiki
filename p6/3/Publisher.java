// Publisher<T> menyiarkan event bertipe T kepada semua Listener yang sudah subscribe.
// Daftar listener disimpan di Registry.
public class Publisher<T> {
    private final Registry<Listener<? super T>> subscribers;

    public Publisher(int capacity) {
        this.subscribers = new Registry<>(capacity);
    }

    public int count() {
        return subscribers.size();
    }

    // Membatalkan pendaftaran. true jika listener ditemukan dan dihapus, selain itu false.
    public boolean unsubscribe(Listener<? super T> listener) {
        // TODO: Implementasikan unsubscribe
        return subscribers.remove(listener);
    }

    // Mendaftarkan listener. Mengembalikan false jika listener null atau sudah terdaftar
    // atau Registry sudah penuh. Selain itu true.
    // Listener bisa untuk T atau supertype-nya.
    public boolean subscribe(Listener<? super T> listener) {
        // TODO: Implementasikan subscribe.
        if (listener == null || subscribers.contains(listener)) return false;
        return subscribers.add(listener);
    }

    // Mengirim event ke SEMUA listener sesuai urutan subscribe (panggil onEvent).
    // Mengembalikan jumlah listener yang dipublish. Jika event null, tidak publish, maka return 0.
    public int publish(T event) {
        // TODO: Implementasikan publish.
        if (event == null) return 0;
        int pub = 0;
        for (int i = 0; i < subscribers.size(); i++) {
          subscribers.get(i).onEvent(event);
          pub++;
        }
        return pub;
    }

    // Meneruskan setiap event dari Publisher ini ke target.
    // Subscribe-kan sebuah Listener (boleh gunakan anonymous class) yang memanggil target.publish(...).
    // target bisa berupa Publisher untuk T atau supertype-nya. Jika target null, do nothing.
    public void forwardTo(Publisher<? super T> target) {
        if (target == null) return;
        Listener<T> listen = new Listener<T>() {
            public void onEvent(T event) { target.publish(event); }
        };
        this.subscribe(listen);
    }
}
