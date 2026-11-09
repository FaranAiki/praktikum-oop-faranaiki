
public class MemberSuspendedException extends LibraryException {
    // TODO: Buat atribut private int daysRemaining
    private int daysRemaining;

    // TODO: Buat constructor MemberSuspendedException(String message, int daysRemaining)
    // Teruskan message ke super, lalu simpan daysRemaining
    public MemberSuspendedException(String message, int daysRemaining) {
        super(message);
        this.daysRemaining = daysRemaining;
    }

    // TODO: Buat method public int getDaysRemaining() yang mengembalikan daysRemaining
    public int getDaysRemaining() {return this.daysRemaining; }
}
