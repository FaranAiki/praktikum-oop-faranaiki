
import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Item> {
    private List<T> items = new ArrayList<>();

    /**
     * Menambahkan item ke inventory
     *
     * @param item item yang ditambahkan
     */
    public void add(T item) {
      items.add(item);
    }

    /**
     * Mengambil item pada index tertentu
     *
     * @param index posisi item
     * @return item pada index tersebut
     */
    public T get(int index) {
      return items.get(index);
    }

    /**
     * Mengembalikan seluruh isi inventory
     *
     * @return list item
     */
    public List<T> getAll() {
      return this.items;
    }

    /**
     * Mengembalikan jumlah total berat semua item
     *
     * @return total berat, 0 jika kosong
     */
    public double totalWeight() {
        // Jika kosong, kembalikan 0
        if (items.size() == 0) return 0;
        double total = 0.0;
        for (T it: items) {
          total += it.getWeight();
        }
        return total;
    }

    /**
     * Mencetak seluruh item dalam format:
     * "<Nama Item> - <Detail Item>"
     *
     * Contoh:
     * "Pedang - Weapon with 20 damage(s)"
     */
    public void printAll() {
        for (T it: items) {
          System.out.println(String.format("%s - %s", it.getName(), it.getDetail()));
        }
    }

    /**
     * Mengecek apakah dua item memiliki kategori yang sama.
     * Weapon dan turunannya termasuk kategori Weapon.
     * Potion termasuk kategori Potion.
     *
     * Contoh:
     * Weapon & Sword  -> true
     * Weapon & Potion -> false
     *
     * @param item1 item pertama
     * @param item2 item kedua
     * @return true jika sekategori, false jika berbeda
     */
    public static <U extends Item> boolean isSameType(U item1, U item2) {
        boolean isItem1Weapon = item1 instanceof Weapon;
        boolean isItem2Weapon = item2 instanceof Weapon;
        if (isItem1Weapon && isItem2Weapon) {
            return true;
        }

        boolean isItem1Potion = item1 instanceof Potion;
        boolean isItem2Potion = item2 instanceof Potion;
        return isItem1Potion && isItem2Potion;
    }

    /**
     * Memasukkan item yang sama ke semua inventory pada list (pada posisi paling belakang).
     *
     * @param item item yang dimasukkan
     * @param inventories list inventory tujuan
     */
    public static <U extends Item> void fillAll(U item, List<Inventory<U>> inventories) {
      for (Inventory<U> inventory: inventories) {
        inventory.add(item);
      }
    }

    /**
     * Mencari item dengan nilai atribut terbesar berdasarkan kategorinya.
     * Jika seluruh item adalah Weapon (termasuk turunannya), kembalikan item dengan damage tertinggi.
     * Jika seluruh item adalah Potion, kembalikan item dengan healAmount tertinggi.
     * Jika inventory kosong atau berisi kategori campuran, kembalikan null.
     * Jika terdapat beberapa item dengan nilai tertinggi yang sama, kembalikan item yang muncul paling awal dalam inventory.
     * Hint : casting ke child class dapat dilakukan dengan menambahkan (nama kelas) nama variabel.
     * @param inventory inventory yang diperiksa
     * @return item dengan nilai tertinggi, atau null
     */
    public static <U extends Item> U strongestItem(Inventory<U> inventory) {
      List<U> items = inventory.getAll();
      if (items == null || items.isEmpty()) return null;

      U strongest = items.get(0);

      for (U it: items) {
        if (!isSameType(it, strongest)) return null;
        if (it instanceof Weapon) {
          if (((Weapon) it).getDamage() > ((Weapon) strongest).getDamage()) strongest = it;
        }
        else if (it instanceof Potion) {
          if (((Potion) it).getHealAmount() > ((Potion) strongest).getHealAmount()) strongest = it;
        }
        else return null;
      }
      return strongest;
    }
}

class Item {
    private String name;
    private double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getDetail() {
        return "Basic item";
    }
}

class Weapon extends Item {
    private int damage;

    public Weapon(String name, double weight, int damage) {
        super(name, weight);
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

    @Override
    public String getDetail() {
        return "Weapon with " + this.damage + " damage(s)";
    }
}

class Potion extends Item {
    private int healAmount;

    public Potion(String name, double weight, int healAmount) {
        super(name, weight);
        this.healAmount = healAmount;
    }

    public int getHealAmount() {
        return this.healAmount;
    }

    @Override
    public String getDetail() {
        return "Potion with " + this.healAmount + " heal amount(s)";
    }
}

class Sword extends Weapon {
    private double length;

    public Sword(String name, double weight, int damage, double length) {
        super(name, weight, damage);
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }
}
