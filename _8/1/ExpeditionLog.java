import java.util.ArrayList;
import java.util.List;

public class ExpeditionLog {
    private final List<String> destinations;

    public ExpeditionLog() {
        // TODO: Inisialisasi destinations dengan ArrayList kosong.
        destinations = new ArrayList<>();
    }

    public void addDestination(String destination) {
        // TODO: Tambahkan tujuan ke akhir daftar; duplikasi diperbolehkan.
        if (destinations == null) return;
        destinations.add(destination);
    }

    public boolean removeDestination(String destination) {
        // TODO: Hapus kemunculan pertama; kembalikan apakah ada yang dihapus.
        if (destinations == null) return false;
        return destinations.remove(destination);
    }

    public String getDestination(int index) {
        // TODO: Kembalikan tujuan pada indeks, atau null jika indeks tidak valid.
        if (destinations == null) return null;
        try {
          return destinations.get(index);
        } catch(Exception e) { return null; }
    }

    public int countVisits(String destination) {
        // TODO: Hitung seluruh kemunculan tujuan yang sama.
        // LES GO PAKE STREAM KARENA BISA DI JAVA 8
        if (destinations == null) return 0;
        return (int) destinations.stream().filter(destination::equals).count();
    }

    public List<String> getDestinations() {
        // TODO: Kembalikan salinan daftar yang dapat dimodifikasi.
        if (destinations == null) return null;
        return new ArrayList<>(destinations);
    }

    public int size() {
        // TODO: Kembalikan banyaknya elemen, termasuk duplikasi.
        if (destinations == null) return 0;
        return destinations.size();
    }
}
