public class Lamp implements Device {
    private int id;
    private boolean on;
    private int brightness;

    /**
     * Konstruktor
     * Lampu baru dalam keadaan mati dengan kecerahan nol
     * @param id
     */
    public Lamp(int id) {
        this.id = id;
        this.on = false;
        this.brightness = 0;
    }

    /**
     * getId
     * @return id lampu
     */
    public int getId() {
        return this.id;
    }

    /**
     * getBrightness
     * @return tingkat kecerahan saat ini
     */
    public int getBrightness() {
        return this.brightness;
    }

    /**
     * Mengatur kecerahan. Nilai di atas Device.MAX_LEVEL dipotong ke MAX_LEVEL
     * @param level tingkat kecerahan yang diinginkan
     */
    public void setBrightness(int level) {
        if (level > Device.MAX_LEVEL) {
            this.brightness = Device.MAX_LEVEL;
        } else {
            this.brightness = level;
        }
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
    }

    @Override
    public boolean getStatus() {
        return this.on;
    }
}
