public class Robot {
    private int id;
    private int battery;

    /**
     * Konstruktor
     * @param id
     * @param battery
     */
    public Robot(int id, int battery) {
        this.id = id;
        this.battery = battery;
    }

    /**
     * getId
     * @return id robot
     */
    public int getId() {
        return this.id;
    }

    /**
     * getBattery
     * @return sisa baterai
     */
    public int getBattery() {
        return this.battery;
    }

    /**
     * Mencetak "Robot id=" diikuti id, spasi, "battery=" diikuti battery
     */
    public void showInfo() {
        System.out.println("Robot id=" + this.id + " battery=" + this.battery);
    }
}
