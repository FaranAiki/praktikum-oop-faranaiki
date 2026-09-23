// TODO: Jadikan kelas ini subclass dari Employee
public class TourGuide extends Employee {
    // TODO: Deklarasikan atribut private 'tips' bertipe double
    private double tips;

    // TODO: Buat konstruktor TourGuide
    // Hint: Panggil konstruktor super dan inisialisasi tips dengan 0.0
    public TourGuide(String name, double baseSalary) {
      super(name, baseSalary);
      this.tips = 0.0;
    }


    // TODO: Buat metode collectTips(double amount)
    // Menambahkan amount ke atribut tips HANYA JIKA amount > 0
    public void collectTips(double amount) {
      if (amount > 0) this.tips += amount;
    }

    // TODO: Override metode calculatePay()
    // Mengembalikan baseSalary ditambah tips
    // Hint: Bagaimana cara mengakses baseSalary yang private? Apakah ada
    //       suatu akses public?
    @Override
    public double calculatePay() {
      return this.getBaseSalary() + tips;
    }

    // TODO: Override metode work()
    // Mengembalikan String "Lying to tourists"
    @Override
    public String work() {
      return "Lying to tourists";
    }
}

