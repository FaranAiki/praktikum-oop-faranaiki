public class TextAnalytics {

    // TODO: implementasi public static int countLetters(String text) yang mengembalikan jumlah huruf
    public static int countLetters(String text) {
	int total = 0;
	for (Character c: text.toCharArray()) {
           if (Character.isLetter(c)) total += 1;
        }
	return total;
    }

    // TODO: public static int countDigits(String text) yang mengembalikan jumlah angka (0-9)
    public static int countDigits(String text) {
	int total = 0;
	for (Character c: text.toCharArray()) {
           if (Character.isDigit(c)) total += 1;
        }
	return total;
    }


    // TODO: public static int countWhitespace(String text) yang mengembalikan jumlah whitespace
    public static int countWhitespace(String text) {
	int total = 0;
	for (Character c: text.toCharArray()) {
           if (Character.isWhitespace(c)) total += 1;
        }
	return total;
    }

    // TODO: public static int countSymbols(String text) yang mengembalikan jumlah simbol
    public static int countSymbols(String text) {
	int total = 0;
	for (Character c: text.toCharArray()) {
           if (!Character.isWhitespace(c) && !Character.isDigit(c) && !Character.isAlphabetic(c)) total += 1;
        }
	return total;
    }

    // TODO: public static int countWords(String text) yang menghitung jumlah kata
    public static int countWords(String text) {
	int total = 0;
	boolean ws_before = false;
	for (Character c: text.trim().toCharArray()) {
           if (Character.isWhitespace(c)) {
		   if (!ws_before)
		       total += 1;
		   ws_before = true;
	   } else {
		ws_before = false;
	   }
        }
	return total + 1;
    }
}
