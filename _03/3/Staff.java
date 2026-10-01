public class Staff extends Person implements Payable {
    private int monthlySalary;

    /**
     * Konstruktor
     * @param id
     * @param monthlySalary
     */
    public Staff(int id, int monthlySalary) {
        // Panggil konstruktor parent class dengan super()
        super(id);
        this.monthlySalary = monthlySalary;
    }

    /**
     * Mengembalikan gaji bulanan
     * @return monthlySalary
     */
    @Override
    public double calculatePay() {
      return monthlySalary;
    }
}
