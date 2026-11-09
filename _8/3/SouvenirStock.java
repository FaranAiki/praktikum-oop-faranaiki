import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SouvenirStock {
    private final Map<String, Integer> stocks;

    public SouvenirStock() {
        // TODO: Inisialisasi stocks dengan HashMap kosong.
        stocks = new HashMap<>();
    }

    public void restock(String name, int quantity) {
        // TODO: Tambahkan stok lama dengan quantity; abaikan quantity <= 0.
        if (quantity > 0) stocks.put(name, quantity + stocks.getOrDefault(name, 0));
    }

    public boolean sell(String name, int quantity) {
        // TODO: Tolak quantity <= 0 atau stok kurang tanpa mengubah data.
        // Jika berhasil, kurangi stok dan hapus entri yang stoknya menjadi 0.
        if (quantity <= 0 || !stocks.containsKey(name) || (quantity > stocks.get(name)) ) return false;
        if (stocks.get(name) == quantity) stocks.remove(name);
        else stocks.put(name, stocks.get(name) - quantity);
        return true;
    }

    public int getStock(String name) {
        // TODO: Kembalikan stok, atau 0 jika nama tidak tercatat.
        return stocks.getOrDefault(name, 0);
    }

    public int getTotalStock() {
        // TODO: Jumlahkan seluruh nilai stok, bukan jumlah jenis suvenir.
        // aku suka stream dan FUNCTIONAL PROGRAMMING LANGUAGE
        return stocks.values().stream().reduce(0, Integer::sum);
    }

    public List<String> getAvailableItems() {
        // TODO: Kembalikan salinan nama barang yang dapat dimodifikasi, terurut.
        return stocks.keySet().stream().sorted().collect(Collectors.toList());
    }

    public String getMostStockedItem() {
        // TODO: Pilih stok terbesar; jika seri, pilih nama terkecil.
        // Kembalikan null jika tidak ada stok.
        // single line jawaban karena functional programming is the best
        return stocks.entrySet().stream().max(
              Map.Entry.<String,Integer>comparingByValue()
              .thenComparing(
                Map.Entry.<String,Integer>comparingByKey(Comparator.reverseOrder())
              )
            ).map(Map.Entry::getKey)
             .orElse(null);
    }
}
