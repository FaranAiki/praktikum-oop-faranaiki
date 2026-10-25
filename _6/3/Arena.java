// TODO: Lengkapi import
import java.util.ArrayList;
import java.util.List;

public class Arena<T extends Fighter> {
    // TODO: Buat atribut private fighters berupa List<T>
    private List<T> fighters = new ArrayList<>();

    // TODO: Buat method enter(T f) untuk menambahkan fighter ke arena
    public void enter(T f) {
      fighters.add(f);
    }

    // TODO: Buat method healAll() untuk memanggil heal(10)
    // pada seluruh fighter di arena
    public void healAll() {
      for (T f: fighters) {
        if (f instanceof Healable)
          ((Healable) f).heal(10);
      }
    }

    // TODO: Buat method strongest() yang mengembalikan T dengan power tertinggi.
    // Jika arena kosong, kembalikan null.
    // Jika terdapat nilai tertinggi yang sama, kembalikan fighter yang muncul paling awal.
    public T strongest() {
      if (fighters.size() == 0) return null;
      T maxPowah = fighters.get(0);
      for (T f: fighters) {
        if (f.getPower() > maxPowah.getPower()) maxPowah = f;
      }
      return maxPowah;
    }

    // TODO: Buat generic method static champion(List<T> list) yang mengembalikan T dengan rank tertinggi.
    // Gunakan compareRank() untuk membandingkan rank.
    // T harus merupakan turunan Fighter dan mengimplementasikan Rankable<T>.
    // Jika list kosong, kembalikan null.
    // Jika terdapat nilai tertinggi yang sama, kembalikan fighter yang muncul paling awal.
    public static<U extends Fighter & Rankable<U>> U champion(List<U> list) {
      if (list == null || list.size() == 0) return null;
      U champ = list.get(0);
      for (U f: list) {
        if (f.compareRank(champ) > 0) champ = f;
      }
      return champ;
    }

    // TODO: Buat method static announceAll(List<? extends Fighter> list) yang mencetak nama setiap fighter pada baris baru
    public static void announceAll(List<? extends Fighter> list) {
      if (list == null || list.size() == 0) return;
      for (Fighter f: list) {
        System.out.println(f.getName());
      }
    }

    // Jika list kosong, tidak mencetak apa pun.

}

abstract class Fighter {
    private String name;
    private int power;

    public Fighter(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public int getPower() {
        return this.power;
    }

    public abstract int attack();
}

interface Healable {
    void heal(int amount);
}

interface Rankable<T> {
    int compareRank(T other);
}

class Knight extends Fighter implements Healable, Rankable<Knight> {
    private int health;
    private int rank;

    public Knight(String name, int power, int health, int rank) {
        super(name, power);
        this.health = health;
        this.rank = rank;
    }

    public int getHealth() {
        return this.health;
    }

    @Override
    public int attack() {
        return this.getPower();
    }

    @Override
    public void heal(int amount) {
        this.health += amount;
    }

    @Override
    public int compareRank(Knight other) {
        return Integer.compare(this.rank, other.rank);
    }
}

class Goblin extends Fighter {
    public Goblin(String name, int power) {
        super(name, power);
    }

    @Override
    public int attack() {
        return this.getPower();
    }
}
