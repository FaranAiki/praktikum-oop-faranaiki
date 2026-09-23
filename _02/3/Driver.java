public class Driver extends User {
    protected boolean onlineStatus; // true = online, false = offline
    protected int numsCompletedOrder;

    /**
     * Konstruktor
     * Driver mulai dari kondisi offline dan belum ada order yang selesai
     * @param name
     * @param phoneNumber
     * @param password
     */
    public Driver(String name, String phoneNumber, String password) {
        // Panggil konstruktor parent class dengan super()
        super(name, phoneNumber, password);
        this.onlineStatus = false;
    }

    /**
     * getOnlineStatus
     * @return status aktif driver saat ini
     */
    public boolean getOnlineStatus() {
      return this.onlineStatus;
    }


    /**
     * getNumsCompletedOrder
     * @return jumlah order yang pernah diselesaikan
     */
    public int getNumsCompletedOrder() {
      return this.numsCompletedOrder;
    }

    /**
     * Membalik status keaktifan driver
     */
    public void toggleStatus() {
      this.onlineStatus = !this.onlineStatus;
    }

    /**
     * Order hanya bisa diambil jika driver online. Jika offline, mencetak
     * "Sedang offline, tidak bisa mengambil order."
     * Kalau online, cek dulu apakah masih ada order berjalan. Jika ada, mencetak
     * "Masih ada order yang berjalan. Tidak bisa membuat order baru"
     * Jika tidak ada, akan mencetak "Order berhasil diambil." lalu memanggil super.startOrder()
     * @param cost Ongkos dari order yang mau diambil
     */
    @Override
    public void takeOrder(int cost) {
      if (!this.onlineStatus) {
        System.out.println("Sedang offline, tidak bisa mengambil order.");
        return;
      }

      if (this.ongoingOrder) {
        System.out.println("Masih ada order yang berjalan. Tidak bisa membuat order baru");
        return;
      }

      System.out.println("Order berhasil diambil.");
      super.startOrder(cost); // this.order seharusnya bisa
    }

    /**
     * Order selesai, ongkos yang tersimpan masuk ke saldo driver
     * Jangan lupa me-reset ongkos yang tersimpan
     */
    @Override
    public void completeOrder() {
      this.increaseBalance(this.orderCost);
      this.orderCost = 0;
      this.ongoingOrder = false;
      this.numsCompletedOrder++;
      System.out.println("Order selesai.");

    }
}
