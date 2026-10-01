public abstract class Snack {
  protected String name;
  protected int calories;

  public Snack(String name, int calories) {
    this.name = name;
    this.calories = calories;
  }

  public String getName() {return this.name;}
  public int getCalories () {return this.calories;}

  public String getInfo() {
    return String.format("Snack: %s (%d kcal)", getName(), getCalories());
  }

  public abstract String consume();
}
