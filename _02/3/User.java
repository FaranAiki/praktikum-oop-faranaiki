public abstract class User {
    protected String name;
    protected String phoneNumber;
    protected String password;
    protected int balance;
    protected boolean ongoingOrder;
    protected int orderCost;

    /**
     * Konstruktor
     * Menyiapkan identitas awal akun. Saldo masih kosong dan tidak ada order yang berjalan.
     * @param name
     * @param phoneNumber
     * @param password
     */
    public User(String name, String phoneNumber, String password) {
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.password = password;
      this.balance = 0;
      this.ongoingOrder = false;
      this.orderCost = 0;
    }

    /**
     * getName
     * @return nama akun
     */
    public String getName() {
      return this.name;
    }

    /**
     * getPhoneNumber
     * @return nomor telepon
     */
    public String getPhoneNumber() {
      return this.phoneNumber;
    }

    /**
     * getBalance
     * @return saldo
     */
    public int getBalance() {
      return this.balance;
    }

    /**
     * Menambah saldo user
     */
    public void increaseBalance(int balance) {
      if (balance > 0)
        this.balance += balance;
    }

    /**
     * Mengurangi saldo user, saldo user minimum adalah 0
     */
    public void decreaseBalance(int balance) {
      if (balance > 0 && balance <= this.balance)
        this.balance -= balance;
      else
        this.balance = 0;
    }

    /**
     * Mencetak
     * "Tidak ada order yang sedang berjalan."
     * atau
     * "Terdapat order yang sedang berjalan."
     * tergantung state dari ongoingOrder
     */
    public void checkOrder() {
      if (this.ongoingOrder) {
        System.out.println("Terdapat order yang sedang berjalan.");
      } else {
        System.out.println("Tidak ada order yang sedang berjalan.");
      }
    }

    /**
     * Memperbarui nomor telepon akun
     * @param phoneNumber Nomor telepon pengganti
     */
    public void changePhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    /**
     * Menyimpan ongkos order dan menandai order mulai berjalan.
     * Dipanggil class turunan jika order bisa diambil
     * @param cost Ongkos dari order yang diambil
     */
    protected void startOrder(int cost) {
      this.orderCost = cost;
      this.ongoingOrder = true;
    }

    /**
     * User mengambil order
     * Tidak diimplementasikan, akan diimplementasikan oleh kelas yang mewarisi
     * @param cost Ongkos dari order yang mau diambil
     */
    public abstract void takeOrder(int cost);

    /**
     * Menandai order sudah selesai dan mencetak "Order selesai."
     * Ongkos yang dipakai adalah yang tersimpan sejak takeOrder.
     */
    public void completeOrder() {
      this.ongoingOrder = false;
      this.balance -= this.orderCost;
      this.orderCost = 0;
      System.out.println("Order selesai.");
    }
}
