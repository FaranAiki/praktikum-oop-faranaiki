public class Lecturer extends Person implements Payable, Teachable {
    private int monthlySalary;

    /**
     * Konstruktor
     * @param id
     * @param monthlySalary
     */
    public Lecturer(int id, int monthlySalary) {
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

    /**
     * Mencetak "Dosen mengajar kode " diikuti courseCode
     * @param courseCode
     */
    @Override
    public void teach(int courseCode) {
      System.out.println("Dosen mengajar kode " + courseCode);
    }
}
