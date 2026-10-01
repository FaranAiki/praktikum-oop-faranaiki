// Reminder:
// TODO: Buat interface Supernatural dan deklarasikan method int getSpookiness() di file Supernatural.java

// TODO: Buat interface Destructive dan deklarasikan method int getDamage() di file Destructive.java

// TODO: Buat interface Apocalyptic yang mengekstend Supernatural dan Destructive sekaligus di file Apocalyptic.java
// TODO: Deklarasikan method String getProphecy() di dalam Apocalyptic

// TODO: Buat kelas BillCipher yang mengimplementasikan Apocalyptic
public class BillCipher implements Apocalyptic {
    // TODO: Tambahkan atribut privat power
    private int power;

    // TODO: Buat konstruktor BillCipher(int power)
    public BillCipher(int power) {
      this.power = power;
    }

    // TODO: Implementasikan method getDamage() yang mereturn power * 10
    public int getDamage() {
      return power * 10;
    }

    // TODO: Implementasikan method getSpookiness() yang mereturn power * 10
    public int getSpookiness() {
      return power * 10;
    }

    // TODO: Implementasikan method getProphecy() yang mereturn "The universe is a hologram!"
    public String getProphecy() {
      return "The universe is a hologram!";
    }
}


