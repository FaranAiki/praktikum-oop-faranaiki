public class Cow extends Livestock {

    /**
     * Konstruktor
     * @param name
     * @param age
     */
    public Cow(String name, int age) {
        // Panggil konstruktor parent class dengan super()
        super(name, age);
    }

    /**
     * Mencetak "Mooooo."
     */
    @Override
    public void talk() {
      System.out.println("Mooooo.");
    }

    /**
     * Hanya bisa produksi susu kalau umur lebih dari 10, kalau berhasil mencetak
     * "<nama> successfully produced milk."
     * Kalau belum cukup umur, mencetak pesan "<nama> is still <umur>, can't produce a product yet."
     */
    @Override
    public void giveProduct() {
      if (this.age > 10) {
        System.out.println(String.format("%s successfully produced milk.", this.name));
      } else {
        System.out.println(String.format("%s is still %d, can't produce a product yet.", this.name, this.age));
      }
    }
}
