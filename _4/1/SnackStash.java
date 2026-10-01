class SnackStash {
  private Snack[] stash;
  private int count;

  public SnackStash(int capacity) {
    count = 0;
    stash = new Snack[capacity];
  }

  public void addSnack(Snack s) {
    if (stash.length <= count) return;
    stash[count++] = s;
  }

  public int getTotalCalories() {
    int cal = 0;
    for (int i = 0; i < count; i++) cal += stash[i].getCalories();
    return cal;
  }

  public String[] consumeAll() {
    String[] ret = new String[count];
    for (int i = 0; i < count; i++) {
      ret[i] = stash[i].consume();
    }
    return ret;
  }
}
