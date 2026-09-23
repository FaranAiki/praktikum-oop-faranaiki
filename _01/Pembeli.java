public class Pembeli {
    private String namaPembeli;
    private int nomorMeja;
    private double saldoPembeli;

    /**
     * Konstruktor Pembeli
     * @param nama
     * @param nomor
     * @param saldo
     */
    public Pembeli(String nama, int nomor, double saldo) {
        this.namaPembeli = nama;
        this.nomorMeja = nomor;
        this.saldoPembeli = saldo;
    }

    /**
     * getNamaPembeli
     * @return namaPembeli
     */
    public String getNamaPembeli() {
        return this.namaPembeli;
    }

    /**
     * setNamaPembeli
     * @param namaBaru
     * @return void
     */
    public void setNamaPembeli(String namaBaru) {
        this.namaPembeli = namaBaru;
    }

    /**
     * getNomorMeja
     * @return nomorMeja
     */
    public int getNomorMeja() {
        return this.nomorMeja;
    }

    /**
     * setNomorMeja
     * @param nomorBaru
     * @return void
     */
    public void setNomorMeja(int nomorBaru) {
        if (nomorBaru < 0)return;
        this.nomorMeja = nomorBaru;
    }

    /**
     * getSaldo
     * @return saldoPembeli
     */
    public double getSaldo() {
        return this.saldoPembeli;
    }

    /**
     * setSaldo
     * @param saldoBaru
     * @return void
     */
    public void setSaldo(double saldoBaru) {
        if (saldoBaru<0)return;
        this.saldoPembeli = saldoBaru;
    }

    /**
     * cekBisaBayar
     * Mengecek apakah saldo cukup untuk membayar total harga OrderMakanan
     * @param order
     * @return true jika saldo mencukupi untuk membayar total harga OrderMakanan, selain itu false
     */
    public boolean cekBisaBayar(OrderMakanan order) {
        if (this.saldoPembeli >= order.getTotalHarga()) return true;
        return false;
    }
}
