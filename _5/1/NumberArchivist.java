public class NumberArchivist {
    // TODO: Buat method static findSmallestType dengan parameter rawValue (String) yang mereturn String ("Byte", "Short", "Integer", atau "Long")
    static String findSmallestType(String rawValue) {
      long val = Long.parseLong(rawValue);

      if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
        return "Byte";
      }

      if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
        return "Short";
      }

      if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
        return "Integer";
      }

      return "Long";
    }

    // TODO: Buat method static isSameValue dengan parameter a dan b (keduanya Number) yang mereturn boolean (perbandingan nilai dengan doubleValue())
    static boolean isSameValue(Number a, Number b) {
        return a.doubleValue() == b.doubleValue();
    }

    // TODO: Buat method static isSameTypeAndValue dengan parameter a dan b (keduanya Number) yang mereturn boolean (perbandingan dengan equals())
    static boolean isSameTypeAndValue(Number a, Number b) {
        return a.equals(b);
    }

    // TODO: Buat method static combine dengan parameter a dan b (keduanya Number) yang mereturn Number hasil penjumlahan dengan tipe terbesar dari kedua parameter
    static Number combine(Number a, Number b) {
      if (a instanceof Double || b instanceof Double) {
        return a.doubleValue() + b.doubleValue();
      }

      if (a instanceof Float || b instanceof Float) {
        return a.floatValue() + b.floatValue();
      }

      if (a instanceof Long || b instanceof Long) {
        return a.longValue() + b.longValue();
      }

      if (a instanceof Integer || b instanceof Integer) {
        return a.intValue() + b.intValue();
      }

      if (a instanceof Short || b instanceof Short) {
        return (short) (a.shortValue() + b.shortValue());
      }

      return (byte) (a.byteValue() + b.byteValue());
    }
}
