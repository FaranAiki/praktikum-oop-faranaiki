public class Creature {
  private String name;
  private int stamina;

  public Creature(String name, int stamina) {
    this.name = name;
    this.stamina = stamina;
  }

  public String getName() {return name;}
  public int getStamina() {return stamina;}

  protected void consumeStamina(int amount) {
    this.stamina = Math.max(0, stamina - amount);
  }
}
