public class Drone extends Robot implements Flyable {
    /**
     * Konstruktor
     * @param id
     * @param battery
     */
    public Drone(int id, int battery) {
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
}
