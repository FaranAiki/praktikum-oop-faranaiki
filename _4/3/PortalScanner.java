public class PortalScanner {
  private Dimension[] dim;
  private int count;

  public PortalScanner(int capacity) {
    dim = new Dimension[capacity];
    count = 0;
  }

  public void addDimension(Dimension d) {
    if (count >= dim.length) return;
    dim[count] = d;
    count++;
  }

  public int scanAll(int portalInstability) {
    int tot = 0;
    for (int i = 0; i<count;i++) {
      tot += dim[i].calculateThreat(portalInstability);
    }
    return tot;
  }
}
