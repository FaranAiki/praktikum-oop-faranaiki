public abstract class Livestock {
    protected String name;
    protected int age;
    protected int happiness;

    /**
     * Konstruktor
     * Hewan baru mulai dari kebahagiaan nol
     * @param name
     * @param age
     */
    public Livestock(String name, int age) {
      this.name = name;
      this.age = age;
      this.happiness = 0;
    }

    /**
     * getName
     * @return nama hewan
     */
    public String getName() {
      return this.name;
    }

    /**
     * getAge
     * @return umur hewan
     */
    public int getAge() {
      return this.age;
    }

    /**
     * getHappiness
     * @return tingkat kebahagiaan hewan
     */
    public int getHappiness() {
      return this.happiness;
    }

    /**
     * Mengubah nama hewan
     * @param name Nama pengganti
     */
    public void setName(String name) {
      this.name = name;
    }

    /**
     * Memberi makan hewan, happiness bertambah sebesar amount. Maksimum happiness adalah 100
     * @param amount Jumlah kenaikan happiness
     */
    public void feed(int amount) {
      if (amount > 0) {
          this.happiness += amount;
      }
      if (this.happiness >= 100) this.happiness = 100;
    }

    /**
     * Menambah umur hewan. Hanya lakukan perubahan jika ageDiff bernilai positif
     * @param ageDiff Selisih umur yang ditambahkan
     */
    public void ageUp(int ageDiff) {
      if (ageDiff > 0) {
        this.age += ageDiff;
      }
    }

    /**
     * Suara yang dikeluarkan hewan, diimplementasikan oleh class turunannya
     */
    public abstract void talk();

    /**
     * Produk yang dikeluarkan hewan, diimplementasikan oleh class turunannya
     */
    public abstract void giveProduct();
}
