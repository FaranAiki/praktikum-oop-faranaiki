public class Monster implements Anomaly {
    // TODO: Buat atribut private name (String), power (int), isHostile (boolean)
    private String name;
    private int power;
    private boolean isHostile;

    // TODO: Buat konstruktor Monster(String name, int power, boolean isHostile)
    public Monster(String name, int power, boolean isHostile) {
      this.name = name;
      this.power = power;
      this.isHostile = isHostile;
    }

    // TODO: Implementasikan override method scan()
    // Hint: Return "Scanning Monster: " ditambah name
    public String scan() {
      return "Scanning Monster: " + name;
    }

    // TODO: Implementasikan override method getDangerLevel()
    // Hint: Cek kondisi isHostile. Jika true = power * 2, jika false = power
    public int getDangerLevel() {
      if (isHostile) return power * 2;
      return power;
    }
}

