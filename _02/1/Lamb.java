public class Lamb extends Livestock {

    /**
     * Konstruktor
     * @param name
     * @param age
     */
    public Lamb(String name, int age) {
        // Panggil konstruktor parent class dengan super()
        super(name, age);
    }

    /**
     * Mencetak "Baaaaa."
     */
    @Override
    public void talk() {
      System.out.println("Baaaaa.");
    }

    /**
     * Hanya bisa produksi wol kalau umur lebih dari 7, kalau berhasil mencetak
     * "<nama> successfully produced wool."
     * Kalau belum cukup umur, mencetak pesan "<nama> is still <umur>, can't produce a product yet."
     */
    @Override
    public void giveProduct() {
      if (this.age > 7) {
        System.out.println(String.format("%s successfully produced wool.", this.name));
      } else {
        System.out.println(String.format("%s is still %d, can't produce a product yet.", this.name, this.age));
      }
    }
}
