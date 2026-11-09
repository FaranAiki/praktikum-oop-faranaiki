import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TagFinder {
    private Map<String, Set<Integer>> photosByTag = new HashMap<>();    // tag -> photoId foto yang memuat tag itu
    private Map<String, Integer> tagUses = new HashMap<>();             // tag -> total kemunculan di semua foto
    private Set<Integer> photos = new HashSet<>();                      // semua photoId foto yang pernah didaftarkan

    public int photoCount() {
        return photos.size();
    }

    public int uniqueTags() {
        return photosByTag.size();
    }

    // TODO: Daftarkan foto dengan photoId dan isi caption.
    // - photoId selalu dimasukkan ke photos, juga untuk caption kosong.
    // - Tag dipisahkan oleh satu atau lebih spasi, dan huruf besar/kecil dianggap sama
    //   (ubah ke huruf kecil). Contoh: "  Java  java JAVA " menghasilkan 3 kemunculan tag "java".
    // - Untuk setiap tag: tambahkan photoId ke photosByTag[tag] dan tambah 1 pada tagUses[tag].
    // - Setiap photoId dijamin hanya didaftarkan satu kali.
    // Hint: Gunakan method String seperti .trim(), .toLowerCase(), .split("\\s+") (arti regex: one or more whitespace char).
    // Text kosong atau hanya spasi tidak punya kata.
    // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
    public void tagPhoto(int photoId, String caption) {
        photos.add(photoId);
        Set<String> caps = new HashSet<>();
        for (String tag: caption.trim().toLowerCase().split("\\s+")) {
            caps.add(tag);
        }
        for (String tag: caps) {
            tagUses.put(tag, tagUses.getOrDefault(tag, 0) + 1);
            if (photosByTag.get(tag) == null) {
                photosByTag.put(tag, new HashSet<Integer>());
            } 
            photosByTag.get(tag).add(photoId);
        }
    }

    // TODO: Kembalikan himpunan photoId foto yang memuat PALING TIDAK SATU tag (kata) pada tags (union).
    // Tag yang tidak ada di photosByTag diabaikan. Huruf besar/kecil dianggap sama.
    // Hasilnya harus set BARU, mengubah hasil ini tidak boleh mengubah isi photosByTag.
    public Set<Integer> findAny(List<String> tags) {
        Set<Integer> photoIds = new HashSet<>();
        for (String tag: tags) {
            tag = tag.trim().toLowerCase();
            if (photosByTag.get(tag) == null) continue;
            photoIds.addAll(photosByTag.get(tag));
        }
        return photoIds;
    }

    // TODO: Kembalikan himpunan photoId foto yang memuat SEMUA tag (kata) pada tags (irisan).
    // Jika ada satu tag yang tidak ada di photosByTag, atau tags kosong, hasilnya himpunan kosong.
    // Hasilnya harus set BARU, jangan sampai isi photosByTag berubah setelah pencarian.
    // Hint: baca fototasi Set.retainAll. Salin dulu set milik photosByTag sebelum meng-irisnya.
    public Set<Integer> findAll(List<String> tags) {
        Set<Integer> photoIds = new HashSet<>(photos);
        for (String tag: tags) {
            tag =  tag.trim().toLowerCase();
            if (photosByTag.get(tag) == null) return new HashSet<>();
            photoIds.retainAll(photosByTag.get(tag));
        }
        return photoIds;
    }

    // TODO: Kembalikan tag dengan total kemunculan (tagUses) terbesar.
    // Jika ada lebih dari satu tag dengan total sama, pilih yang urutan abjadnya paling awal
    // (gunakan compareTo). Belum ada tag sama sekali -> null.
    public String popularTag() {
        return tagUses.entrySet().stream().max(
              Map.Entry.<String,Integer>comparingByValue()
              .thenComparing(
                Map.Entry.<String,Integer>comparingByKey(Comparator.reverseOrder())
              )
            ).map(Map.Entry::getKey)
             .orElse(null);
    }
}
