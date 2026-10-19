public class PasswordEvaluator {
    // TODO: Buat method static hasDigit dengan parameter password (String) yang mereturn boolean (cek apakah ada angka)
    static boolean hasDigit(String password) {
      for (char c: password.toCharArray()) {
        if (Character.isDigit(c)) return true;
      }
      return false;
    }

    // TODO: Buat method static hasUpperCase dengan parameter password (String) yang mereturn boolean (cek apakah ada huruf kapital)
    static boolean hasUpperCase(String password) {
      for (char c: password.toCharArray()) {
        if (Character.isUpperCase(c)) return true;
      }
      return false;
    }

    // TODO: Buat method static hasLowerCase dengan parameter password (String) yang mereturn boolean (cek apakah ada huruf kecil)
    static boolean hasLowerCase(String password) {
      for (char c: password.toCharArray()) {
        if (Character.isLowerCase(c)) return true;
      }
      return false;
    }

    // TODO: Buat method static hasNoWhitespace dengan parameter password (String) yang mereturn boolean (cek apakah TIDAK ada spasi/whitespace)
    static boolean hasNoWhitespace(String password) {
      for (char c: password.toCharArray()) {
        if (Character.isWhitespace(c)) return false;
      }
      return true;
    }

    // TODO: Buat method static isStrongPassword dengan parameter password (String) yang mereturn boolean (panjang minimal 8 dan memenuhi keempat syarat di atas)
    static boolean isStrongPassword(String password) {
      return (password != null) && (password.length() >= 8) && hasDigit(password) && hasUpperCase(password) && hasLowerCase(password) && hasNoWhitespace(password);
    }
}

