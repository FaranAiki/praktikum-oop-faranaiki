
public class Library {
    // TODO: Buat method public static void borrowBook(int bookId, boolean isSuspended, int daysRemaining) throws LibraryException
    // Bungkus logika berikut dengan try dan finally. finally selalu mencetak "Transaksi selesai".
    // Id buku yang tersedia hanya 7 dan 8. Periksa id ini sebelum status suspend.
    // Jika bookId bukan 7 dan bukan 8, lempar BookNotAvailableException dengan pesan "Buku tidak tersedia".
    // Jika id tersedia dan isSuspended bernilai true, lempar MemberSuspendedException
    // dengan pesan "Anggota sedang disuspend" dan daysRemaining dari parameter.
    // Jika id tersedia dan anggota tidak disuspend, method selesai tanpa melempar exception.
    public static void borrowBook(int bookId, boolean isSuspended, int daysRemaining) throws BookNotAvailableException, MemberSuspendedException {
        try {
            if (bookId != 7 && bookId != 8) throw new BookNotAvailableException("Buku tidak tersedia");

            if (isSuspended) throw new MemberSuspendedException("Anggota sedang disuspend", daysRemaining);
        } finally {
            System.out.println("Transaksi selesai");
        }
    }
}
