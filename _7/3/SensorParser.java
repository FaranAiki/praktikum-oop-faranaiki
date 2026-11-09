public class SensorParser {
    // TODO: Buat method public static int parseReading(String raw) throws SensorDataException
    // Di dalam try, kembalikan Integer.parseInt(raw).
    // catch (NumberFormatException e): lempar SensorDataException baru
    // dengan pesan "Format data sensor tidak valid" dan e sebagai cause.
    public static int parseReading(String raw) throws SensorDataException {
      try {
        return Integer.parseInt(raw);
      } catch (NumberFormatException e) {
        throw new SensorDataException("Format data sensor tidak valid", e);
      }
    }

    // TODO: Buat method public static void validateRange(int reading)
    // Jangan menulis throws pada signature.
    // Jika reading < 0 atau reading > 100, lempar SensorRangeException
    // dengan pesan "Pembacaan di luar rentang 0 sampai 100".
    // Nilai 0 dan 100 valid.
    public static void validateRange(int reading) {
      if (reading < 0 || reading > 100) throw new SensorRangeException("Pembacaan di luar rentang 0 sampai 100");
    }
}
