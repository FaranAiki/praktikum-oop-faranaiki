// TODO: Jadikan kelas ini turunan dari Attraction
public class MonsterExhibit extends Attraction {
    // TODO: Deklarasikan atribut private 'isReal' bertipe boolean
    private boolean isReal;

    // TODO: Buat konstruktor MonsterExhibit
    public MonsterExhibit(String name, int ticketPrice, boolean isReal) {
      super(name, ticketPrice);
      this.isReal = isReal;
    }

    // TODO: Override metode getRevenue(int visitors)
    // Jika isReal == true, pengunjung lari (kembalikan 0).
    // Jika isReal == false, kembalikan pendapatan normal menggunakan metode dari SUPERCLASS.
    @Override
    public int getRevenue(int visitors) {
      if (isReal) return 0;
      return super.getRevenue(visitors);
    }


    // TODO: Override metode getDescription()
    // Kembalikan deskripsi dari SUPERCLASS, digabung dengan kondisi berikut (perhatikan spasi):
    // Jika isReal == true : tambah " It's actually real! Run!"
    // Jika isReal == false: tambah " 100% fake guaranteed."
    @Override
    public String getDescription() {
      return String.format("%s %s", super.getDescription(), isReal ? "It's actually real! Run!" : "100% fake guaranteed.");
    }
}

