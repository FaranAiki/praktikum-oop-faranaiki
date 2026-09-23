public class Transaction {
    private String type;
    private int amount;
    private String walletOwner;

    private static int totalTransactions = 0;

    /**
     * Konstruktor Transaction
     *
     * Setiap Transaction yang dibuat akan otomatis menambah
     * jumlah total transaksi yang pernah tercatat di seluruh toko.
     *
     * @param type        jenis transaksi ("DEPOSIT" atau "WITHDRAW")
     * @param amount      nominal transaksi
     * @param walletOwner nama pemilik wallet terkait transaksi ini
     */
    public Transaction(String type, int amount, String walletOwner) {
        // TODO: Inisialisasi type, amount, dan walletOwner sesuai parameter,
        // lalu perbarui jumlah total transaksi yang tercatat
        this.type = type;
        this.amount = amount;
        this.walletOwner = walletOwner;

        totalTransactions += 1;
    }

    /**
     * getType
     *
     * @return jenis transaksi
     */
    public String getType() {
        // TODO: Kembalikan type
        return this.type;
    }

    /**
     * getAmount
     *
     * @return nominal transaksi
     */
    public int getAmount() {
        // TODO: Kembalikan amount
        return this.amount;
    }

    /**
     * getWalletOwner
     *
     * @return nama pemilik wallet terkait transaksi ini
     */
    public String getWalletOwner() {
        // TODO: Kembalikan walletOwner
        return this.walletOwner;
    }

    /**
     * getTotalTransactions
     *
     * Method static untuk mengetahui total transaksi yang pernah tercatat
     * di seluruh toko.
     *
     * @return jumlah total transaksi
     */
    public static int getTotalTransactions() {
        // TODO: Kembalikan totalTransactions
        return totalTransactions; // jujur ga tau alternatif this. apaan, kalo di python kan tinggal nama kelas aja
    }
}
