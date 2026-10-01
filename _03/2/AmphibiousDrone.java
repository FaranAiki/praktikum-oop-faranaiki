public class AmphibiousDrone extends Robot implements Amphibious {
    /**
     * Konstruktor
     * @param id
     * @param battery
     */
    public AmphibiousDrone(int id, int battery) {
        // Panggil konstruktor parent class dengan super()
        super(id, battery);
    }

    /**
     * Mencetak "Lepas landas."
     */
    @Override
    public void takeOff() {
      System.out.println("Lepas landas.");
    }

    /**
     * Mencetak "Mendarat."
     */
    @Override
    public void land() {
      System.out.println("Mendarat.");
    }

    /**
     * Mencetak "Menyelam ke " diikuti depth
     * @param depth
     */
    @Override
    public void dive(int depth) {
      System.out.println("Menyelam ke " + depth);
    }

    /**
     * Mencetak "Muncul ke permukaan."
     */
    @Override
    public void surface() {
      System.out.println("Muncul ke permukaan.");
    }
}
