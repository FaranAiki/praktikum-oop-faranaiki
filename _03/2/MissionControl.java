public class MissionControl {
    /**
     * Menjalankan survei udara: takeOff, describeMovement, land
     * @param f objek yang bisa terbang
     */
    public static void surveyArea(Flyable f) {
        f.takeOff();
        f.describeMovement();
        f.land();
    }

    /**
     * Menyeberangi sungai: dive(5), describeMovement, surface
     * @param s objek yang bisa berenang
     */
    public static void crossRiver(Swimmable s) {
        s.dive(5);
        s.describeMovement();
        s.surface();
    }
}
