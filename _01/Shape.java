public class Shape {
    String name;
    Color c;

    public Shape(String n) {
        System.out.println(String.format("Shape is being built with default color and name '%s'", n));
        this.name = n;
        this.c = new Color(0, 0, 0);
    }

    public Shape() {
        System.out.println("Shape is being built with default color and name 'Default'");
        this.c = new Color(0, 0, 0);
        this.name = "Default";
    }

    public Shape(int r, int g, int b) {
        System.out.println(String.format("Shape is being built with color RGB(%d, %d, %d) and default name 'Default'", r, g, b));
        this.c = new Color(r, g, b);
        this.name = "Default";
    }

    public Shape(Color c, String n) {
        System.out.println(String.format("Shape is being built with color %s and name '%s'", c.toString(), n));
        this.c = c;
        this.name = n;
    }

    public Shape(String n, Color c) {
        System.out.println(String.format("Shape is being built with color %s and name '%s'", c.toString(), n));
        this.c = c;
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setColor(int r, int g, int b) {
        this.c = new Color(r, g, b);
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public Color getColor() {
        return this.c;
    }
}
