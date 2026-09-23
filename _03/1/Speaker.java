public class Speaker implements Device {
    private int id;
    private boolean on;
    private int volume;

    /**
     * Konstruktor
     * Speaker baru dalam keadaan mati dengan volume nol
     * @param id
     */
    public Speaker(int id) {
      this.id = id;
      on = false;
      volume = 0;
    }

    /**
     * getId
     * @return id speaker
     */
    public int getId() {
      return id;
    }

    /**
     * getVolume
     * @return volume saat ini
     */
    public int getVolume() {
      return volume;
    }

    /**
     * Mengatur volume. Nilai di atas Device.MAX_LEVEL dipotong ke MAX_LEVEL
     * @param volume
     */
    public void setVolume(int volume) {
      this.volume = volume;
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
