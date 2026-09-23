public class CheckingAccount extends Account {
    protected int overdraftLimit;

    /**
     * Konstruktor
     * Batas overdraft ditentukan sejak rekening dibuat
     * @param nomorRekening
     * @param overdraftLimit
     */
    public CheckingAccount(String nomorRekening, int overdraftLimit) {
        // Panggil konstruktor parent class dengan super()
        super(nomorRekening);
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * getOverdraftLimit
     * @return batas overdraft rekening ini
     */
    public int getOverdraftLimit() {
      return this.overdraftLimit;
    }

    /**
     * Penarikan boleh membuat saldo menjadi negatif, selama tidak melebihi
     * overdraftLimit. Jika melebihi, cetak pesan "Penarikan gagal karena melewati batas overdraft."
     */
    @Override
    public void withdraw(int jumlah) {
      if (jumlah - saldo > overdraftLimit) {
        System.out.println("Penarikan gagal karena melewati batas overdraft.");
        return;
      }
      this.saldo -= jumlah;
    }

    /**
     * Rekening jenis ini tidak menghasilkan bunga
     */
    @Override
    public double calculateInterest() {
      return 0;
    }
}
