import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TeamRoster {
    private List<String> players = new ArrayList<>();         // urutan kontrak
    private Map<String, Integer> points = new HashMap<>();    // nama -> poin
    private Set<String> stars = new HashSet<>();              // nama pemain bintang (poin >= 50)

    // TODO: Kontrak pemain baru dengan poin awal 0.
    // Kembalikan false (tanpa mengubah apa pun) jika player null atau sudah terdaftar. Selain itu true.
    public boolean signPlayer(String player) {
        if (player == null || players.contains(player)) return false;
        players.add(player);
        points.put(player, 0);
        return true;
    }

    // TODO: Ubah poin pemain menjadi pts. Kembalikan false jika player belum terdaftar.
    // Pemain dianggap bintang jika pts >= 50. Perbarui juga isi himpunan stars
    // (pemain yang poinnya turun di bawah 50 harus dikeluarkan dari stars).
    public boolean setPoints(String player, int pts) {
        if (!players.contains(player)) return false;
        points.put(player, pts);
        if (pts >= 50) {
            stars.add(player);
        } else {
            stars.remove(player);
        }
        return true;
    }

    // TODO: Kembalikan poin pemain. Jika player belum terdaftar, kembalikan -1.
    public int getPoints(String player) {
        return points.getOrDefault(player, -1);
    }

    public int countStars() {
        return stars.size();
    }

    // TODO: Kembalikan rata-rata poin semua pemain terdaftar (termasuk yang poinnya masih 0).
    // Belum ada pemain -> 0.0
    public double averagePoints() {
      /*
        double total = 0.0;
        double ssize = 0.0;
        for (Map.Entry<String, Integer> e: points.entrySet()) {
            ssize += 1;
            total += e.getValue();
        }
        return total / ssize;*/
      return points.values().stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    // TODO: Kembalikan daftar nama pemain yang poinnya LEBIH BESAR dari min (bukan sama dengan),
    // sesuai urutan kontrak. Tidak ada yang cocok -> list kosong.
    public List<String> playersAbove(int min) {
        return players.stream().filter((String a) -> (points.get(a) > min)).collect(Collectors.toList());
    }

    // TODO: Hapus pemain dari semua koleksi (players, points, dan stars).
    // Kembalikan false jika player tidak terdaftar, selain itu true.
    public boolean release(String player) {
        if (!players.contains(player)) return false;
        stars.remove(player);
        players.remove(player);
        points.remove(player);
        return true;
    }
}
