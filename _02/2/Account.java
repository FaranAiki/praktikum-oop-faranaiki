public abstract class Account {
    protected String nomorRekening;
    protected int saldo;

    /**
     * Konstruktor
     * Rekening baru dibuat dengan saldo nol
     * @param nomorRekening
     */
    public Account(String nomorRekening) {
      this.nomorRekening = nomorRekening;
      this.saldo = 0;
    }

    /**
     * getNomorRekening
     * @return nomor rekening
     */
    public String getNomorRekening() {
      return this.nomorRekening;
    }

    /**
     * getSaldo
     * @return saldo rekening saat ini
     */
    public int getSaldo() {
      return this.saldo;
    }

    /**
     * Menambah saldo rekening
     * @param jumlah Jumlah yang disetor
     */
    public void deposit(int jumlah) {
      this.saldo = jumlah;
      if (jumlah < 0) this.saldo = 0;
    }

    /**
     * Menarik saldo dari rekening. Aturan minimum saldo dan batas penarikan
     * berbeda tergantung jenis rekeningnya, diimplementasikan oleh turunannya
     * @param jumlah Jumlah yang ingin ditarik
     */
    public abstract void withdraw(int jumlah);

    /**
     * Menghitung bunga yang berlaku untuk rekening ini, aturan dan besarannya
     * berbeda tergantung jenis rekeningnya, diimplementasikan oleh turunannya
     */
    public abstract double calculateInterest();
}
