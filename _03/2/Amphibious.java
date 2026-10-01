public interface Amphibious extends Flyable, Swimmable {
    /**
     * Menyelesaikan konflik default method describeMovement
     * dengan memanggil Flyable.super.describeMovement()
     */
    @Override
    default void describeMovement() {
      Flyable.super.describeMovement();
    }
}
