public class Creature {
    // TODO: Deklarasikan dua atribut dengan modifier 'protected'
    // 1. name (tipe String)
    // 2. dangerLevel (tipe int)
    protected String name;
    protected int dangerLevel;


    // TODO: Buat konstruktor untuk menginisialisasi name dan dangerLevel
    public Creature(String name, int dangerLevel) {
        this.name = name;
        this.dangerLevel = dangerLevel;
    }

    // TODO: Buat metode makeNoise() yang mengembalikan String "Unknown noise"
    public String makeNoise() {
      return "Unknown noise";
    }

    // TODO: Buat metode toString() yang mengembalikan representasi String
    // Format: "Creature: [name] (Danger: [dangerLevel])"
    @Override
    public String toString() {
      return String.format("Creature: %s (Danger: %d)", this.name, this.dangerLevel);
    }
}

