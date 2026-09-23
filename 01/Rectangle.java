public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    /**
     * Konstruktor default Rectangle
     *
     * Membuat Rectangle dengan origin di titik (0, 0)
     */
    public Rectangle() {
        // TODO: Inisialisasi Rectangle dengan origin di koordinat (0, 0)
        this.origin = new Point(0, 0);
    }

    /**
     * Konstruktor Rectangle dengan parameter origin
     *
     * @param p titik origin
     */
    public Rectangle(Point p) {
        // TODO: Inisialisasi Rectangle dengan origin di koordinat p
        this.origin = p;
    }

    /**
     * Konstruktor Rectangle dengan parameter width dan height
     *
     * @param w lebar rectangle
     * @param h tinggi rectangle
     */
    public Rectangle(int w, int h) {
        // TODO: Inisialisasi Rectangle dengan origin default (0, 0) serta width dan height sesuai parameter
        this.origin = new Point(0, 0);
        this.width = w;
        this.height = h;
    }

    /**
     * Konstruktor Rectangle dengan parameter origin, width, dan height
     *
     * @param p titik origin
     * @param w lebar rectangle
     * @param h tinggi rectangle
     */
    public Rectangle(Point p, int w, int h) {
        // TODO: Inisialisasi Rectangle dengan origin, width, dan height sesuai parameter
        this.origin = p;
        this.width = w;
        this.height = h;
    }

    /**
     * move
     *
     * Memindahkan posisi origin rectangle ke koordinat baru
     *
     * @param x koordinat x baru
     * @param y koordinat y baru
     */
    public void move(int x, int y) {
        // TODO: Pindahkan origin ke koordinat (x, y)
        // this.origin = new Point(x, y);
        this.origin.setX(x);
        this.origin.setY(y);
    }

    /**
     * getArea
     *
     * @return luas rectangle
     */
    public int getArea() {
        // TODO: Hitung dan kembalikan luas rectangle
        return this.width * this.height;
    }

    /**
     * toString
     *
     * Format: "Rectangle dengan titik origin = (x, y), width = W, dan height = H"
     * Contoh: "Rectangle dengan titik origin = (0, 0), width = 100, dan height = 200"
     *
     * @return representasi String dari rectangle
     */
    @Override
    public String toString() {
        // TODO: Kembalikan representasi String dari rectangle sesuai format
        return String.format("Rectangle dengan titik origin = (%d, %d), width = %d, dan height = %d", this.origin.getX(), this.origin.getY(), this.width, this.height);
    }
}
