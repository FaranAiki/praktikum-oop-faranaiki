public interface Flyable {
    void takeOff();

    void land();

    default void describeMovement() {
        System.out.println("Bergerak di udara.");
    }
}
