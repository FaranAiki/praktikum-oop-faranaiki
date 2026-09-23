public class StanWallet {
    private String owner;
    private int balance;
    private Transaction lastTransaction;

    private static int totalStoreRevenue = 0;

    /**
     * Konstruktor StanWallet dengan saldo awal 0
     *
     * @param owner nama pemilik wallet
     */
    public StanWallet(String owner) {
        // TODO: Inisialisasi StanWallet dengan owner sesuai parameter dan saldo 0
        this.balance = 0;
        this.owner = owner;
    }

    /**
     * Konstruktor StanWallet dengan saldo awal tertentu
     *
     * @param owner          nama pemilik wallet
     * @param initialBalance saldo awal wallet
     */
    public StanWallet(String owner, int initialBalance) {
        // TODO: Inisialisasi owner, lalu setor saldo awal ke wallet (jika initialBalance > 0)
        this.owner = owner;
        // melalui method deposit(), sehingga totalStoreRevenue dan lastTransaction ikut ter-update
        this.deposit(initialBalance);
    }

    /**
     * deposit
     *
     * Menyetor uang ke dalam wallet. Hanya diproses jika amount > 0.
     * Setiap setoran yang berhasil menambah totalStoreRevenue dan
     * mencatat sebuah Transaction baru bertipe "DEPOSIT".
     *
     * @param amount jumlah uang yang disetor
     * @return true jika setoran berhasil, false jika tidak valid
     */
    public boolean deposit(int amount) {
        // TODO: Jika amount valid (> 0):
        // - tambahkan amount ke balance dan totalStoreRevenue
        // - buat object Transaction baru bertipe "DEPOSIT" dan simpan sebagai lastTransaction
        // - kembalikan true
        // Jika tidak valid, kembalikan false tanpa membuat Transaction
        if (amount > 0) {
            this.totalStoreRevenue += amount;
            this.balance += amount;
            this.lastTransaction = new Transaction("DEPOSIT", amount,this.getOwner());
            return true;
        }
        return false;
    }

    /**
     * withdraw
     *
     * Menarik uang dari wallet. Hanya diproses jika amount > 0
     * dan tidak melebihi saldo yang tersedia. Setiap penarikan
     * yang berhasil mencatat sebuah Transaction baru bertipe "WITHDRAW".
     *
     * @param amount jumlah uang yang ditarik
     * @return true jika penarikan berhasil, false jika tidak valid
     */
    public boolean withdraw(int amount) {
        // TODO: Jika amount valid (> 0 dan tidak melebihi balance):
        // - kurangi balance dengan amount
        // - buat object Transaction baru bertipe "WITHDRAW" dan simpan sebagai lastTransaction
        // - kembalikan true
        // Jika tidak valid, kembalikan false tanpa membuat Transaction
        if (amount > 0 && this.balance > amount) {
          this.balance -= amount;
          this.lastTransaction = new Transaction("WITHDRAW", amount, this.getOwner());
          return true;
        }

        return false;
    }

    /**
     * getOwner
     *
     * @return nama pemilik wallet
     */
    public String getOwner() {
        // TODO: Kembalikan owner
        return this.owner;
    }

    /**
     * getBalance
     *
     * @return saldo wallet saat ini
     */
    public int getBalance() {
        // TODO: Kembalikan balance
        return this.balance;
    }

    /**
     * getLastTransaction
     *
     * @return Transaction terakhir yang tercatat pada wallet ini,
     *         atau null jika belum pernah ada transaksi yang berhasil
     */
    public Transaction getLastTransaction() {
        // TODO: Kembalikan lastTransaction
        return this.lastTransaction;
    }

    /**
     * getTotalStoreRevenue
     *
     * Method static untuk mengetahui total seluruh uang yang pernah
     * disetor ke semua wallet sejak toko beroperasi.
     *
     * @return total pemasukan toko
     */
    public static int getTotalStoreRevenue() {
        // TODO: Kembalikan totalStoreRevenue
        return totalStoreRevenue;
    }

    /**
     * toString
     *
     * Format: "StanWallet ini dimiliki oleh X dengan balance sebesar $Y"
     * Contoh: "StanWallet ini dimiliki oleh Stan dengan balance sebesar $100"
     *
     * @return representasi String dari wallet
     */
    @Override
    public String toString() {
        // TODO: Kembalikan representasi String wallet sesuai format
        return String.format("StanWallet ini dimiliki oleh %s dengan balance sebesar $%d", this.getOwner(), this.getBalance());
    }
}
