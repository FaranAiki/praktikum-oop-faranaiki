public class MabelJuice extends Snack {
  private int plasticDinosaurs;

  public MabelJuice(String name, int calories, int plasticDinosaurs) {
    super(name, calories);
    this.plasticDinosaurs = plasticDinosaurs;
  }

  @Override
  public String getInfo() {
    return String.format("%s, Extras: %d plastic dinosaurs", super.getInfo(), plasticDinosaurs);
  }

  @Override
  public String consume() {
    return String.format("GULP! Tastes like sparkles and %d plastic dinosaurs!", plasticDinosaurs);
  }
}
