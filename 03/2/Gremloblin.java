// Reminder
// TODO: Buat interface Supernatural dan deklarasikan method int getSpookiness() di file Supernatural.java

// TODO: Buat interface Destructive dan deklarasikan method int getDamage() di file Destructive.java

// TODO: Buat interface Apocalyptic yang mengekstend Supernatural dan Destructive sekaligus di file Apocalyptic.java
// TODO: Deklarasikan method String getProphecy() di dalam Apocalyptic

// TODO: Buat kelas Gremloblin yang mengimplementasikan Supernatural dan Destructive
// Hint: Gunakan koma untuk mengimplementasikan lebih dari satu interface.
public class Gremloblin implements Supernatural, Destructive {
    // TODO: Tambahkan atribut privat clawsDamage dan scaryEyes
    private int clawsDamage, scaryEyes;

    // TODO: Buat konstruktor Gremloblin(int clawsDamage, int scaryEyes)
    public Gremloblin(int clawsDamage, int scaryEyes) {
      this.clawsDamage = clawsDamage;
      this.scaryEyes = scaryEyes;
    }

    // TODO: Implementasikan method getDamage()
    public int getDamage() {
      return clawsDamage;
    }

    // TODO: Implementasikan method getSpookiness()
    public int getSpookiness() {
      return scaryEyes;
    }
}

