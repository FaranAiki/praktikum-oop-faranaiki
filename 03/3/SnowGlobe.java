public class SnowGlobe implements Shippable, Sellable {
  private String name;
  private int price;
  private double weight;

  public SnowGlobe(String name, int price, double weight) {
    this.name = name;
    this.price = price;
    this.weight = weight;
  }

  public String getName() {return this.name;}
  public int getPrice() {return this.price;}
  public double getWeight() {return this.weight;}
}

