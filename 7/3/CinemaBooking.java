
public class CinemaBooking {
    // TODO: Buat method public static boolean getSeatStatus(boolean[] seats, int index)
    // Di dalam try, kembalikan seats[index] secara langsung.
    // catch (ArrayIndexOutOfBoundsException e): kembalikan false
    // finally: cetak "Pengecekan selesai"
    public static boolean getSeatStatus(boolean[] seats, int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        } finally {
            System.out.println("Pengecekan selesai");
        }
    }

    // TODO: Buat method public static void bookSeat(boolean[] seats, int index) throws SeatAlreadyTakenException
    // Jika seats[index] bernilai true, lempar SeatAlreadyTakenException
    // dengan pesan "Kursi sudah terisi" dan seatNumber = index.
    // Jika kursi kosong, method selesai tanpa melempar exception dan tanpa mengubah array.
    public static void bookSeat(boolean[] seats, int index) throws SeatAlreadyTakenException {
        if (seats[index]) throw new SeatAlreadyTakenException("Kursi sudah terisi", index);
    }
}
