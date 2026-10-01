public class SmileDip extends Snack {
  private boolean isBanned;
  public SmileDip(String name, int calories, boolean isBanned) {
    super(name, calories);
    this.isBanned = isBanned;
  }

  public String getInfo() {
    return String.format("%s, Banned: %b", super.getInfo(), isBanned);
  }

  public String consume() {
    if (isBanned) {
      return "LICK! Entering the hallucination world... The Future Is In The Past!";
    }
    return "LICK! Just normal strawberry flavor.";
  }
}
