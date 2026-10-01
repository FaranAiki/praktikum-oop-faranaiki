public interface Teachable {
    /**
     * Mengajar mata kuliah dengan kode tertentu
     * @param courseCode
     */
    void teach(int courseCode);

    /**
     * getTitle
     * @return "Pengajar."
     */
    default String getTitle() {
        return "Pengajar.";
    }
}
