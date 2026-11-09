public class InsufficientStockException extends InventoryException {
    // TODO: Buat atribut private int shortage
    private int shortage;

    // TODO: Buat constructor InsufficientStockException(String message, int shortage)
    // Teruskan message ke super, lalu simpan shortage
    public InsufficientStockException(String message, int shortage) {
      super(message);
      this.shortage = shortage;
    }

    // TODO: Buat method public int getShortage() yang mengembalikan shortage
    public int getShortage() {
      return this.shortage;
    }
}
