public class AirConditioner implements Device {
    private int id;
    private boolean on;
    private int temperature;

    /**
     * Konstruktor
     * AC baru dalam keadaan mati dengan suhu 25
     * @param id
     */
    public AirConditioner(int id) {
      this.id = id;
      on = false;
      temperature = 25;
    }

    /**
     * getId
     * @return id AC
     */
    public int getId() {
      return id;
    }

    /**
     * getTemperature
     * @return suhu saat ini
     */
    public int getTemperature() {
      return temperature;
    }

    /**
     * Mengatur suhu
     * @param temperature
     */
    public void setTemperature(int temperature) {
      this.temperature = temperature;
    }

    @Override
    public void turnOn() {
      on = true;
    }

    @Override
    public void turnOff() {
      on = false;
    }

    @Override
    public boolean getStatus() {
      return on;
    }
}
