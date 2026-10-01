public class ArcadeConsole {
    // TODO: Deklarasikan array roster bertipe ArcadeCharacter dan int count
    private ArcadeCharacter[] roster;
    private int count;

    // TODO: Buat constructor berparameter capacity. Inisiasi array dan count.
    public ArcadeConsole(int capacity) {
      roster = new ArcadeCharacter[capacity];
      count = 0;
    }

    // TODO: Buat method boolean addCharacter(ArcadeCharacter c).
    // Jika array belum penuh, tambahkan, naikkan count, return true.
    // Jika penuh, return false.
    public boolean addCharacter(ArcadeCharacter c) {
      if (roster.length <= count) return false;
      roster[count] = c;
      count++;
      return true;
    }

    // TODO: Buat method int triggerUltimateAttack(int basePower).
    // Lakukan iterasi ke setiap objek di roster.
    // HANYA pangil calculateDamage() jika isAlive() == true.
    // Jumlahkan semua damage dan return totalnya.
    public int triggerUltimateAttack(int basePower) {
      int d = 0;
      for (int i = 0; i < count; i++) {
        if (roster[i].isAlive()) d += roster[i].calculateDamage(basePower);
      }
      return d;
    }
}
