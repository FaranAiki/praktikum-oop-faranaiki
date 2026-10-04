public class RescueDrone extends Machine implements Rescuer {
  public RescueDrone(String name, int battery) {
    super(name, battery);
  }

  public int rescue(int requested) {
    if (requested == 0) return 0;
    requested = Math.min(2, requested);
    while (requested != 0 && getBattery() < 3 * requested) {
      requested--;
    }
    consumeBattery(3 * requested);

    return requested;
  }
}
