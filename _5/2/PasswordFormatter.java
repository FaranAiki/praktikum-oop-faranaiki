public class PasswordFormatter {
    // TODO: Buat method static toTitleCase dengan parameter text (String) yang mereturn String dalam format Title Case
    static String toTitleCase(String text) {
        if (text == null || text.isEmpty()) return text;

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c: text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                result.append(c);
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    // TODO: Buat method static removeWhitespace dengan parameter text (String) yang mereturn String tanpa karakter whitespace
    static String removeWhitespace(String text) {
      if (text == null) return null;

      // uhu regex :%s/\\s+/
      return text.replaceAll("\\s+", "");
    }

    // TODO: Buat method static formatPassword dengan parameter raw (String) yang mereturn String (hasil toTitleCase lalu dihilangkan spasi dengan removeWhitespace)
    static String formatPassword(String raw) {
      return removeWhitespace(toTitleCase(raw));
    }
}
