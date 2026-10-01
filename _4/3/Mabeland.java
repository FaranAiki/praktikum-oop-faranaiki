public class Mabeland implements Dimension {
  private String name;

  public Mabeland(String name) {
    this.name = name;
  }

  public String getDimensionName() {return this.name;}

  public int getBaseThreatLevel() {return 0;}

  public int calculateThreat(int portalInstability) {
    return (portalInstability > 80)? 500: 0;
  }
}
