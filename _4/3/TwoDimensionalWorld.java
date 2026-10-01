public class TwoDimensionalWorld implements Dimension {
  private String name;
  private int baseThreat;

  public TwoDimensionalWorld(String name, int baseThreat) {
    this.name = name;
    this.baseThreat = baseThreat;
  }

  public String getDimensionName() {return this.name;}

  public int getBaseThreatLevel() {return this.baseThreat;}

  public int calculateThreat(int portalInstability) {
    return (int) Math.floor(baseThreat / 2);
  }
}

