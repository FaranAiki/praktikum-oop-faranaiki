public class SmartHomeHub {
    /**
     * Menghidupkan lalu mematikan perangkat lewat kontrak Device
     * @param d perangkat apa pun yang mengimplementasi Device
     */
    public static void operate(Device d) {
      d.turnOn();
      d.turnOff();
    }

    /**
     * Mengatur atribut khusus sesuai jenis perangkat:
     * Lamp ke kecerahan 80, AirConditioner ke suhu 24, Speaker ke volume 50
     * @param d perangkat apa pun yang mengimplementasi Device
     */
    public static void describe(Device d) {
      if (d instanceof Lamp) {
        Lamp lamp = (Lamp) d;
        lamp.setBrightness(80);
      } else if (d instanceof AirConditioner) {
        AirConditioner ac = (AirConditioner) d;
        ac.setTemperature(24);
      } else if (d instanceof Speaker) {
        Speaker speak = (Speaker) d;
        speak.setVolume(50);
      }
    }
}
