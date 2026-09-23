public class Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;
    private String id;

    private static int numberOfBicycles = 0;

    /**
     * Konstruktor default Bicycle
     *
     * Membuat Bicycle baru dengan cadence 0, speed 0, gear 1,
     * serta id yang di-generate otomatis dengan format "BIKE-N"
     * (N adalah urutan sepeda yang dibuat, dimulai dari 1).
     */
    public Bicycle() {
        // TODO: Generate id otomatis dan perbarui jumlah total sepeda yang telah dibuat
        this.numberOfBicycles += 1;
        this.id = String.format("BIKE-%d", numberOfBicycles);
    }

    /**
     * Konstruktor Bicycle dengan parameter cadence dan gear
     *
     * @param cadence nilai cadence awal
     * @param gear    nilai gear awal
     */
    public Bicycle(int cadence, int gear) {
        // TODO: Manfaatkan constructor lain (this()) untuk inisialisasi id,
        this();
        // lalu atur cadence dan gear sesuai parameter
        // (manfaatkan method changeCadence/changeGear agar validasi tetap berlaku)
        this.cadence = cadence;
        this.gear = gear;
    }

    /**
     * changeCadence
     *
     * Mengubah nilai cadence. Nilai baru hanya diterima jika >= 0.
     *
     * @param newValue nilai cadence yang baru
     */
    public void changeCadence(int newValue) {
        // TODO: Ubah cadence hanya jika newValue valid (>= 0)
        if (newValue >= 0) {
            this.cadence = newValue;
        }
    }

    /**
     * changeGear
     *
     * Mengubah nilai gear. Nilai baru hanya diterima jika berada
     * pada rentang 1 sampai 6 (inklusif).
     *
     * @param newValue nilai gear yang baru
     */
    public void changeGear(int newValue) {
        // TODO: Ubah gear hanya jika newValue berada pada rentang 1-6
        if (newValue <= 6 && newValue >= 1) {
            this.gear = newValue;
        }
    }

    /**
     * speedUp
     *
     * Menambah kecepatan sepeda. Hanya diproses jika increment > 0.
     *
     * @param increment jumlah penambahan kecepatan
     */
    public void speedUp(int increment) {
        // TODO: Tambahkan speed dengan increment jika valid (> 0)
        if (increment > 0) {
            this.speed += increment;
        }
    }

    /**
     * applyBrakes
     *
     * Mengurangi kecepatan sepeda. Hanya diproses jika decrement > 0.
     * Kecepatan tidak boleh menjadi negatif (minimal 0).
     *
     * @param decrement jumlah pengurangan kecepatan
     */
    public void applyBrakes(int decrement) {
        // TODO: Kurangi speed dengan decrement jika valid (> 0),
        // pastikan speed tidak menjadi negatif
        if (decrement > 0) {
            this.speed -= decrement;
        }

        if (this.speed <= 0) this.speed = 0;
    }

    /**
     * getCadence
     *
     * @return nilai cadence saat ini
     */
    public int getCadence() {
        // TODO: Kembalikan nilai cadence
        return this.cadence;
    }

    /**
     * getSpeed
     *
     * @return nilai speed saat ini
     */
    public int getSpeed() {
        // TODO: Kembalikan nilai speed
        return this.speed;
    }

    /**
     * getGear
     *
     * @return nilai gear saat ini
     */
    public int getGear() {
        // TODO: Kembalikan nilai gear
        return this.gear;
    }

    /**
     * getId
     *
     * @return id unik dari sepeda ini
     */
    public String getId() {
        // TODO: Kembalikan id sepeda
        return this.id;
    }

    /**
     * getNumberOfBicycles
     *
     * Method static untuk mengetahui total sepeda yang sudah pernah dibuat.
     *
     * @return jumlah total Bicycle yang sudah dibuat
     */
    public static int getNumberOfBicycles() {
        // TODO: Kembalikan jumlah total sepeda yang sudah dibuat
        return numberOfBicycles;
    }

    /**
     * toString
     *
     * Format: "Bicycle id, cadence:C, speed:S, gear:G"
     * Contoh: "Bicycle BIKE-1, cadence: 50, speed: 10, gear: 2"
     *
     * @return representasi String dari bicycle
     */
    @Override
    public String toString() {
        // TODO: Kembalikan representasi String bicycle sesuai format
        return String.format("Bicycle %s, cadence: %d, speed: %d, gear: %d", this.id, this.cadence, this.speed, this.gear);
    }
}
