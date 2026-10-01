public class TeachingAssistant extends Student implements Payable, Teachable {
    private double hourlyRate;
    private int hoursWorked;

    /**
     * Konstruktor
     * @param id
     * @param semester
     * @param hourlyRate
     * @param hoursWorked
     */
    public TeachingAssistant(int id, int semester, double hourlyRate, int hoursWorked) {
        // Panggil konstruktor parent class dengan super()
        super(id, semester);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    /**
     * Gaji dihitung dari hourlyRate dikali hoursWorked
     * @return hasil perkalian hourlyRate dan hoursWorked
     */
    @Override
    public double calculatePay() {
      return hourlyRate * hoursWorked;
    }

    /**
     * Mencetak "Asisten mengajar kode " diikuti courseCode
     * @param courseCode
     */
    @Override
    public void teach(int courseCode) {
      System.out.println("Asisten mengajar kode "+courseCode);
    }
}
