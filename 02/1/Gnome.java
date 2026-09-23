// TODO: Jadikan kelas Gnome sebagai turunan (subclass) dari Creature
public class Gnome extends Creature {
    // TODO: Deklarasikan atribut private 'hatColor' bertipe String
    private String hatColor;


    // TODO: Buat konstruktor Gnome(String name, int dangerLevel, String hatColor)
    // Hint: Gunakan keyword 'super' untuk memanggil konstruktor kelas induk
    public Gnome(String name, int dangerLevel, String hatColor) {
      super(name, dangerLevel);
      this.hatColor = hatColor;
    }


    // TODO: Lakukan Override pada metode makeNoise()
    // Harus mengembalikan String "Schmebulock!"
    @Override
    public String makeNoise() {
      return "Schmebulock!";
    }


    // TODO: Lakukan Override pada metode toString()
    // Format: "Gnome: [name] with [hatColor] hat (Danger: [dangerLevel])"
    @Override
    public String toString() {
      return String.format("Gnome: %s with %s hat (Danger: %d)", this.name, this.hatColor, this.dangerLevel);
    }
}

