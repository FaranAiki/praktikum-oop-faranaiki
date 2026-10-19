public class MemoryGun {
    // TODO: Deklarasikan atribut tubes (array of MemoryTube) dan count (int) dengan modifier private
    private MemoryTube[] tubes;
    private int count;

    // TODO: Buat constructor dengan parameter capacity (int) untuk menginisialisasi array tubes dengan ukuran capacity dan count dengan 0
    public MemoryGun(int capacity) {
      tubes = new MemoryTube[capacity];
      count = 0;
    }

    // TODO: Buat method addTube(MemoryTube tube) untuk menambahkan tube ke array tubes jika kapasitas masih ada
    public void addTube(MemoryTube tube) {
      if (count >= tubes.length) return;
      tubes[count] = tube;
      count++;
    }

    // TODO: Buat method getTotalLength() yang mereturn total panjang karakter (length) dari content semua tube yang ada
    public int getTotalLength() {
      int tot = 0;
      for (MemoryTube t: tubes) {
        if (t == null) break;
        tot += t.getContent().length();
      }
      return tot;
    }

    // TODO: Buat method mergeMemories() yang menggabungkan seluruh content dari tube yang ada secara berurutan menggunakan StringBuilder dan method append()
    // Return string kosong jika count == 0
    public String mergeMemories() {
      if (count == 0) return "";

      StringBuilder sb = new StringBuilder();

      for (MemoryTube t: tubes) {
        if (t == null) break;
        sb.append(t.getContent());
      }

      return sb.toString();
    }
}
