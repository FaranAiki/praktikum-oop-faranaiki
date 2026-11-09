public class Warehouse {
    // TODO: Buat method public static void takeItem(int itemId, int quantity) throws InventoryException
    // Stok tetap setiap barang valid adalah 10.
    // Id yang dikenal hanya 101 dan 102.
    // Jika itemId bukan 101 dan bukan 102, lempar ItemNotFoundException dengan pesan "Barang tidak ditemukan".
    // Periksa id ini sebelum memeriksa stok.
    // Jika id dikenal dan quantity > 10, lempar InsufficientStockException
    // dengan pesan "Stok tidak cukup" dan shortage = quantity - 10.
    // Jika id dikenal dan quantity <= 10, method selesai tanpa melempar exception.
    public static void takeItem(int itemId, int quantity) throws ItemNotFoundException, InsufficientStockException {
      if (itemId != 101 && itemId != 102) throw new ItemNotFoundException("Barang tidak ditemukan");
      if (quantity > 10) throw new InsufficientStockException("Stok tidak cukup", quantity - 10);
    }
}
