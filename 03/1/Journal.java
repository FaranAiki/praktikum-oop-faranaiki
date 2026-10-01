public class Journal {
    // TODO: Buat atribut private author (String)
    private String author;

    // TODO: Buat konstruktor Journal(String author)
    public Journal(String author) {
      this.author = author;
    }

    // TODO: Buat method findMostDangerous(Anomaly a1, Anomaly a2) yang mengembalikan Anomaly
    // Hint: Bandingkan a1.getDangerLevel() dengan a2.getDangerLevel().
    // Return Anomaly yang memiliki danger level lebih besar. Jika sama, return a1.
    public Anomaly findMostDangerous(Anomaly a1, Anomaly a2) {
      int a1_danger = 0;
      int a2_danger = 0;
      if (a1 instanceof Artifact) {
        a1_danger = ((Artifact) a1).getDangerLevel();
      } else if (a1 instanceof Monster) {
        a1_danger = ((Monster) a1).getDangerLevel();
      }

      if (a2 instanceof Artifact) {
        a2_danger = ((Artifact) a2).getDangerLevel();
      } else if (a1 instanceof Monster) {
        a2_danger = ((Monster) a2).getDangerLevel();
      }

      if (a1_danger >= a2_danger) {
        return a1;
      }
      return a2;
    }
}

