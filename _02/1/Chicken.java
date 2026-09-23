public class Chicken extends Livestock {

    /**
     * Konstruktor
     * @param name
     * @param age
     */
    public Chicken(String name, int age) {
        // Panggil konstruktor parent class dengan super()
        super(name, age);
    }

    /**
     * Mencetak "Cluck-cluck."
     */
    @Override
    public void talk() {
      System.out.println("Cluck-cluck.");
    }

    /**
     * Hanya bisa bertelur kalau umur lebih dari 5, kalau berhasil mencetak
     * "<nama> successfully laid egg."
     * Kalau belum cukup umur, mencetak pesan "<nama> is still <umur>, can't produce a product yet."
     */
    @Override
    public void giveProduct() {
      if (this.age > 5) {
        System.out.println(String.format("%s successfully laid egg.", this.name));
      } else {
        System.out.println(String.format("%s is still %d, can't produce a product yet.", this.name, this.age));
      }
    }
}
