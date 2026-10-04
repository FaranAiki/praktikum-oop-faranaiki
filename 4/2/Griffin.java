public class Griffin extends Creature implements Rescuer {
  public Griffin(String name, int stamina) {
    super(name, stamina);
  }

  public int rescue(int requested) {
    if (requested == 0) return 0;
    requested = Math.min(3, requested);
    while (requested != 0 && getStamina() < 2 * requested) {
      requested--;
    }
    consumeStamina(2 * requested);

    return requested;
  }
}
