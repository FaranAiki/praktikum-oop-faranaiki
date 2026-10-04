public class Machine {
  private String name;
  private int battery;

  public Machine(String name, int battery) {
    this.name = name;
    this.battery = battery;
  }

  public String getName() {return name;}
  public int getBattery() {return battery;}

  protected void consumeBattery(int amount) {
    this.battery = Math.max(0, battery - amount);
  }
}
