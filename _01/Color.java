/*
 * kak maap ini oop emg main tebak-tebakan apa gmn
 *
 * maap kak sayanya yg lupa pencet heheheh
 * */
public class Color {
    int r, g, b;

    public Color(int r, int g, int b) {
        this.setColor(r, g, b);
        System.out.println(String.format("Color is being built with RGB(%d, %d, %d)", r, g, b));
    }

    public Color() {
        this.r = 0;
        this.g = 0;
        this.b = 0;
    }

    public int getRed() {
        return this.r;
    }

    @Override
    public String toString() {
        // TODO: Return a string in the format "RGB(red, green, blue)"
        // Example: if red=255, green=128, blue=64, return "RGB(255, 128, 64)"
        return String.format("RGB(%d, %d, %d)", this.r, this.g, this.b);
    }

    public int getGreen() {
        return this.g;
    }

    public int getBlue() {
        return this.b;
    }

    public void setColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
