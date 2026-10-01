public class PayrollSystem {
    /**
     * Mencetak "Membayar: " diikuti hasil calculatePay()
     * @param p objek yang bisa digaji
     */
    public static void pay(Payable p) {
      double uang = 0;
      if (p instanceof Staff) {
        Staff staff = (Staff) p;
        uang = staff.calculatePay();
      } else if (p instanceof Lecturer) {
        Lecturer l = (Lecturer) p;
        uang = l.calculatePay();
      } else if (p instanceof TeachingAssistant) {
        TeachingAssistant ta = (TeachingAssistant) p;
        uang = ta.calculatePay();
      }
      System.out.println("Membayar: " + uang);
    }
}
