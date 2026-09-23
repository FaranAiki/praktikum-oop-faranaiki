// TODO: Jadikan kelas ini subclass dari Employee
public class Handyman extends Employee {
    // TODO: Deklarasikan atribut private 'fixedItems' bertipe int
    private int fixedItems;

    // TODO: Buat konstruktor Handyman
    // Hint: Panggil super(...) dan inisialisasi fixedItems dengan 0
    public Handyman(String name, double baseSalary) {
      super(name, baseSalary);
      this.fixedItems = 0;
    }


    // TODO: Buat metode fixThings(int count)
    // Menambahkan count ke atribut fixedItems HANYA JIKA count > 0
    public void fixThings(int count) {
      if (count > 0) this.fixedItems += count;
    }


    // TODO: Override metode calculatePay()
    // Mengembalikan baseSalary ditambah bonus perbaikan
    @Override
    public double calculatePay() {
      return this.getBaseSalary() + this.fixedItems * 10.5;
    }

    // TODO: Override metode work()
    // Mengembalikan String "Fixing the vending machine"
    @Override
    public String work() {
      return "Fixing the vending machine";
    }
}

