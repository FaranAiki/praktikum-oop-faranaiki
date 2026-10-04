public class RegularTicket extends Ticket {
  public RegularTicket(String name, int basePrice) {
    super(name, basePrice);
  }

  @Override
  public int unitPrice() {
    return basePrice;
  }
}
