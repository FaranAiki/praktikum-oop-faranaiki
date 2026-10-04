public class NightTourTicket extends Ticket {
  private int guideFee;
  public NightTourTicket(String name, int basePrice, int guideFee) {
    super(name, basePrice);
    this.guideFee = guideFee;
  }
  public int unitPrice() {
    return this.basePrice + this.guideFee;
  }

  @Override
  public int totalPrice(int quantity) {
    return (quantity - (quantity / 5)) * unitPrice();
  }

  @Override
  public String getInfo() {
    return super.getInfo() + ", Night Tour";
  }
}
