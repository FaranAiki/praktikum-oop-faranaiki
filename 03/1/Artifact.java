public class Artifact implements Anomaly {
    // TODO: Buat atribut private itemName (String) dan aura (int)
    private String itemName;
    private int aura;
    // TODO: Buat konstruktor Artifact(String itemName, int aura)

    public Artifact(String itemName, int aura) {
      this.itemName = itemName;
      this.aura = aura;
    }

    // TODO: Implementasikan override method scan()
    // Hint: Return "Scanning Artifact: " ditambah itemName
    public String scan() {
      return "Scanning Artifact: " + itemName;
    }

    // TODO: Implementasikan override method getDangerLevel()
    // Hint: Return aura
    @Override
    public int getDangerLevel() {
      return aura;
    }
}

