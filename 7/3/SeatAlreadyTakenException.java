
public class SeatAlreadyTakenException extends Exception {
    // TODO: Buat atribut private int seatNumber
    private int seatNumber;

    // TODO: Buat constructor SeatAlreadyTakenException(String message, int seatNumber)
    // Teruskan message ke super, lalu simpan seatNumber
    public SeatAlreadyTakenException(String message, int seatNumber) {
        super(message);
        this.seatNumber = seatNumber;
    }

    // TODO: Buat method public int getSeatNumber() yang mengembalikan seatNumber
    public int getSeatNumber() { return this.seatNumber; }
 }
