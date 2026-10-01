public class NightmareRealm implements Dimension {
  private String name;
  private int baseThreat;

  public NightmareRealm(String name, int baseThreat) {
    this.name = name;
    this.baseThreat = baseThreat;
  }

  public String getDimensionName() {return this.name;}

  public int getBaseThreatLevel() {return this.baseThreat;}

  public int calculateThreat(int portalInstability) {
    return (portalInstability > 50)? getBaseThreatLevel() * 3 + 1000 : getBaseThreatLevel() * 3;
  }
}
