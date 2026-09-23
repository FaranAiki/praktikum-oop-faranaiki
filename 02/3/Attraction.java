public class Attraction {
    // TODO: Deklarasikan atribut private 'name' (String) dan 'ticketPrice' (int)
    private String name;
    private int ticketPrice;

    // TODO: Buat konstruktor Attraction
    public Attraction(String name, int ticketPrice) {
      this.name = name;
      this.ticketPrice = ticketPrice;
    }

    // TODO: Buat metode getRevenue(int visitors)
    // Mengembalikan total pendapatan: visitors dikali ticketPrice
    public int getRevenue(int visitors) {
      return visitors * ticketPrice;
    }


    // TODO: Buat metode getDescription()
    // Mengembalikan format: "Welcome to [name]!"
    public String getDescription() {
      return String.format("Welcome to %s!", this.name);
    }
}

