public class Employee {
    // TODO: Deklarasikan atribut private 'name' (String) dan 'baseSalary' (double)
    private String name;
    private double baseSalary;

    // TODO: Buat konstruktor Employee(String name, double baseSalary)
    public Employee(String name, double baseSalary) {
      this.name = name;
      this.baseSalary = baseSalary;
    }

    // TODO: Buat getter standar: getName() dan getBaseSalary()
    public String getName() {return this.name;}
    public double getBaseSalary() {return this.baseSalary;}


    // TODO: Buat metode calculatePay()
    // Mengembalikan nilai baseSalary
    public double calculatePay() {
      return this.getBaseSalary();
    }

    // TODO: Buat metode work()
    // Mengembalikan String "Doing general tasks"
    public String work() {
      return "Doing general tasks";
    }
}

