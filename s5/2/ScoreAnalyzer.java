public class ScoreAnalyzer {

    //TODO: implementasi public static boolean isBulat(Number value) yang mengembalikan true jika value adalah bilangan bulat (Integer dan Long)
    public static boolean isBulat(Number value) {
   	return (value instanceof Integer) || (value instanceof Long);
    }

    //TODO: public static Number sum(Number a, Number b) yang menjumlahkan dua Number a dan b dengan aturan sesuai soal.
    //Hint: Jika a dan b adalah bilangan bulat, akukan penjumlahan dalam bentuk long terlebih dahulu ( gunakan metode .longValue() ). Jika ternyata hasilnya bisa menggunakan Integer, baru cast ke Integer.
    public static Number sum(Number a, Number b) {
	if (a instanceof Double || b instanceof Double) return (Double) (a.doubleValue() + b.doubleValue());
	if (a instanceof Float || b instanceof Float) return (Float) (a.floatValue() + b.floatValue());

    	long val = a.longValue() + b.longValue();
	if (val > Integer.MAX_VALUE) return (Long) val;
	return (Integer) (a.intValue() + b.intValue());
    }

    //TODO: public static Number findMaximum(Number[] values) yang mencari Number tertinggi. Karena values bisa mengandung bilangan pecahan, gunakan .doubleValue saat membandingkan nilai dua Number!
    
    public static Number findMaximum(Number[] values) {
	if (values.length == 0) return null;
	Number cm = values[0];
	for (int i = 1; i < values.length; i++) {
            if (values[i].doubleValue() > cm.doubleValue()) cm = values[i];
	}
	return cm;
    }
}
