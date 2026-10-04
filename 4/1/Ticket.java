public abstract class Ticket {
  protected String name;
  protected int basePrice;

  public Ticket(String name, int basePrice) {
    this.name = name;
    this.basePrice = basePrice;
  }

  public String getName() {return this.name; }
  public int getBasePrice() {return this.basePrice; }
  public abstract int unitPrice();

  public int totalPrice(int quantity) {
    return unitPrice() * quantity;
  }

  public int totalPrice(int quantity, int voucher) {
    return Math.max(0, totalPrice(quantity) - voucher);
  }

  public String getInfo() {
    return "Ticket: " + getName();
  }
}
