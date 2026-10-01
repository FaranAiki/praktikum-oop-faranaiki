public class CursedAmulet implements Sellable {
  private String name;
  private int price;

  public CursedAmulet(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() { return this.name; }
  public int getPrice() { return this.price; }
}
