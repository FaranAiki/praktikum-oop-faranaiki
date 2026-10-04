// Berkas pendukung: jangan diubah atau dikumpulkan.
public class Machine {
    private String name;
    private int battery;

    public Machine(String name, int battery) {
        this.name = name;
        this.battery = battery;
    }

    public String getName() { return name; }
    public int getBattery() { return battery; }

    // amount dijamin nonnegatif; pengurangan dibatasi hingga baterai 0.
    protected void consumeBattery(int amount) {
        battery = Math.max(0, battery - amount);
    }
}
