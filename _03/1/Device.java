public interface Device {
    int MAX_LEVEL = 100;

    void turnOn();

    void turnOff();

    boolean getStatus();
}
