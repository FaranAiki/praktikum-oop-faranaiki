public interface Swimmable {
    void dive(int depth);

    void surface();

    default void describeMovement() {
        System.out.println("Bergerak di air.");
    }

    /**
     * Mengecek apakah kedalaman bernilai positif
     * @param depth
     * @return true jika depth > 0
     */
    static boolean isValidDepth(int depth) {
        return depth > 0;
    }
}
