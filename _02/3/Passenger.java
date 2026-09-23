public class Passenger extends User {
    protected boolean isPremium;
    protected int totalOrdersPlaced;

    /**
     * Konstruktor
     * Passenger tidak premium dan belum pernah melakukan order
     * @param name
     * @param phoneNumber
     * @param password
     */
    public Passenger(String name, String phoneNumber, String password) {
        // Panggil konstruktor parent class dengan super()
        super(name, phoneNumber, password);
    }

    /**
     * getIsPremium
     * @return status premium passenger
     */
    public boolean getIsPremium() {
      return this.isPremium;
    }

    /**
     * getTotalOrdersPlaced
     * @return jumlah order yang pernah dilakukan
     */
    public int getTotalOrdersPlaced() {
      return this.totalOrdersPlaced;
    }

    /**
     * Mengubah status premium passenger
     * @param isPremium Status premium yang baru
     */
    public void setPremium(boolean isPremium) {
      this.isPremium = isPremium;
    }
    /**
     * Order hanya bisa dilakukan jika saldo cukup. Jika tidak, mencetak
     * "Saldo tidak cukup untuk memesan order."
     * Kalau saldo cukup, cek dulu apakah masih ada order berjalan. Jika ada, mencetak
     * "Masih ada order yang berjalan. Tidak bisa membuat order baru"
     * Jika tidak ada, akan mencetak "Order berhasil dibuat." lalu memanggil super.startOrder()
     * Jika premium, ongkos yang dicek dan disimpan sudah dipotong diskon 15%. Gunakan Math.round(cost * 0.15f)
     * @param cost Ongkos dari order yang akan dipesan
     */
    @Override
    public void takeOrder(int cost) {
      if (this.balance < cost) {
        System.out.println("Saldo tidak cukup untuk memesan order.");
        return;
      }

      if (this.ongoingOrder) {
        System.out.println("Masih ada order yang berjalan. Tidak bisa membuat order baru");
        return;
      }

      System.out.println("Order berhasil dibuat.");
      this.totalOrdersPlaced++;

      if (this.isPremium) {
        super.startOrder(Math.round(cost * 0.85f));
        return;
      }

      super.startOrder(cost);
    }

    /**
     * Order selesai dan saldo passenger berkurang sesuai ongkos yang tersimpan
     * Jangan lupa me-reset ongkos yang tersimpan
     */
    @Override
    public void completeOrder() {
      System.out.println("Order selesai.");
      this.decreaseBalance(this.orderCost);
      this.orderCost = 0;
      this.ongoingOrder = false;
    }
}
