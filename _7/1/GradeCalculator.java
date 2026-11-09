public class GradeCalculator {
    // TODO: Buat method public static int getScoreAt(int[] scores, int index)
    // Akses scores[index] langsung di dalam try, tanpa pengecekan batas secara manual.
    // Jangan tangkap exception-nya.
    // finally mencetak "Perhitungan selesai".
    // Jika index di luar batas, ArrayIndexOutOfBoundsException tetap dilempar setelah finally berjalan.
    public static int getScoreAt(int[] scores, int index) {
      try {
        return scores[index];
      } finally {
        System.out.println("Perhitungan selesai");
      }
    }

    // TODO: Buat method public static int calculateAverage(int[] scores, int index)
    // Di dalam try, lakukan tiga hal berurutan:
    // 1. Jumlahkan seluruh elemen scores.
    // 2. Bagi total dengan scores.length memakai pembagian int, lalu simpan sebagai hasil.
    // 3. Jika index >= 0, panggil getScoreAt(scores, index). Jangan mengganti hasil dengan nilai yang dikembalikan getScoreAt.
    // catch (ArithmeticException e): hasil = 0
    // catch (ArrayIndexOutOfBoundsException e): hasil = -1
    // finally: cetak "Perhitungan selesai"
    // Kembalikan hasil.
    // Pembagian dilakukan sebelum pengecekan index, jadi array kosong menghasilkan 0 walaupun index >= 0.
    public static int calculateAverage(int[] scores, int index) {
      int hasil = 0;
      try {
        for (int i = 0; i < scores.length; i++) {
          hasil += scores[i];
        }
        hasil = hasil / scores.length;
        if (index >= 0) getScoreAt(scores, index);
      } catch (ArithmeticException e) {
        hasil = 0;
      } catch (ArrayIndexOutOfBoundsException e) {
        hasil = -1;
      } finally {
        System.out.println("Perhitungan selesai");
      }
      return hasil;
    }

    // TODO: Buat method public static void validateScore(int score)
    // Jika score < 0 atau score > 100, lempar IllegalArgumentException
    // dengan pesan "Nilai harus di antara 0 dan 100".
    // Jika score valid, method selesai tanpa melempar exception.
    public static void validateScore(int score) {
      if (score < 0 || score > 100) throw new IllegalArgumentException("Nilai harus di antara 0 dan 100");
    }
}
