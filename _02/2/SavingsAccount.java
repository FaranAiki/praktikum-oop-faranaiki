public class SavingsAccount extends Account {

    /**
     * Konstruktor
     * @param nomorRekening
     */
    public SavingsAccount(String nomorRekening) {
        // Panggil konstruktor parent class dengan super(i)
        super(nomorRekening);
    }

    /**
     * Penarikan hanya berhasil jika saldo cukup, saldo tidak boleh menjadi negatif.
     * Jika saldo tidak cukup, cetak pesan "Penarikan gagal karena saldo tidak mencukupi."
     */
    @Override
    public void withdraw(int jumlah) {
      if (jumlah > saldo){
        System.out.println( "Penarikan gagal karena saldo tidak mencukupi.");
        return;
      }
      // how the fuck did I miss this?????????????????
      this.saldo -= jumlah;
    }

    /**
     * Bunga dihitung sebesar 2% dari saldo saat ini
     */
    @Override
    public double calculateInterest() {
      return 0.02 * this.saldo;
    }
}
