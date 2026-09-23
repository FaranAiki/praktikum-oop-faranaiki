// TODO: Jadikan kelas ini turunan dari Attraction
public class Illusion extends Attraction {
    // TODO: Deklarasikan atribut private 'mirrorCount' bertipe int
    private int mirrorCount;

    // males nebak jir kaowkawo
    // TODO: Buat konstruktor Illusion
    public Illusion(String name, int ticketPrice, int mirrorCount) {
      super(name, ticketPrice);
      this.mirrorCount = mirrorCount;
    }

    // TODO: Override metode getRevenue(int visitors)
    // Karena ini ruang ilusi, pengunjung nyasar dan membayar dua kali!
    // Kembalikan hasil getRevenue dari SUPERCLASS lalu kalikan 2
    @Override
    public int getRevenue(int visitors) {
      return 2 * super.getRevenue(visitors);
    }


    // TODO: Override metode getDescription()
    // Kembalikan deskripsi dari SUPERCLASS, digabung dengan (spasi di awal):
    // " Prepare to be confused by [mirrorCount] mirrors!"
    // Contoh output akhir: "Welcome to Bottomless Pit! Prepare to be confused by 50 mirrors!"
    @Override
    public String getDescription() {
      // gas str format males nebak ga tau java
      return String.format("%s Prepare to be confused by %d mirrors!", super.getDescription(), this.mirrorCount);
    }
}

