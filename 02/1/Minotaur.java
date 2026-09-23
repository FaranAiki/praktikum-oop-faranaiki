// TODO: Jadikan kelas Minotaur sebagai turunan dari Creature
public class Minotaur extends Creature {
    // TODO: Deklarasikan atribut private 'hornLength' bertipe int
    private int hornLength;


    // TODO: Buat konstruktor Minotaur
    public Minotaur(String name, int dangerLevel, int hornLength) {
      super(name, dangerLevel);
      this.hornLength = hornLength;
    }


    // TODO: Override metode makeNoise()
    // Harus mengembalikan String "Manotaur roars!"
    @Override
    public String makeNoise() {
      return "Manotaur roars!";
    }


    // TODO: Override metode toString()
    // Format: "Minotaur: [name] with [hornLength]cm horns (Danger: [dangerLevel])"
    @Override
    public String toString() {
        return String.format("Minotaur: %s with %dcm horns (Danger: %d)", this.name, this.hornLength, this.dangerLevel);

    }
}

