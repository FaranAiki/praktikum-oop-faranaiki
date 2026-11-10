import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MiniSearch {
    private Map<String, Set<Integer>> index = new HashMap<>();    // kata -> id dokumen yang memuat kata itu
    private Map<String, Integer> totalCount = new HashMap<>();    // kata -> total kemunculan di semua dokumen
    private Set<Integer> docs = new HashSet<>();                  // semua id dokumen yang pernah didaftarkan

    public int docCount() {
        return docs.size();
    }

    public int uniqueWords() {
        return index.size();
    }

    // Daftarkan dokumen dengan id dan isi text.
    public void indexDocument(int id, String text) {
        // Selalu masukkan id ke dalam set docs
        docs.add(id);

        if (text == null) return;

        // Hapus spasi di awal dan akhir, lalu cek apakah kosong
        String trimmed = text.trim();
        if (trimmed.isEmpty()) return;

        // Ubah menjadi huruf kecil semua dan pisahkan berdasarkan satu/lebih spasi
        String[] words = trimmed.toLowerCase().split("\\s+");

        for (String word : words) {
            // Tambahkan id ke dalam index[kata] (menggunakan HashSet baru jika belum ada)
            index.computeIfAbsent(word, k -> new HashSet<>()).add(id);

            // Tambahkan 1 pada totalCount[kata]
            totalCount.put(word, totalCount.getOrDefault(word, 0) + 1);
        }
    }

    // Kembalikan himpunan id dokumen yang memuat PALING TIDAK SATU kata pada words (union).
    public Set<Integer> searchAny(List<String> words) {
        Set<Integer> result = new HashSet<>();
        if (words == null) return result;

        for (String word : words) {
            String w = word.toLowerCase();
            // Jika kata ada di dalam index, gabungkan (addAll) semua doc id-nya ke result
            if (index.containsKey(w)) {
                result.addAll(index.get(w));
            }
        }
        return result;
    }

    // Kembalikan himpunan id dokumen yang memuat SEMUA kata pada words (irisan).
    public Set<Integer> searchAll(List<String> words) {
        if (words == null || words.isEmpty()) return new HashSet<>();

        Set<Integer> result = null;

        for (String word : words) {
            String w = word.toLowerCase();

            // Jika ada satu kata saja yang tidak ada di index, irisannya pasti himpunan kosong
            if (!index.containsKey(w)) {
                return new HashSet<>();
            }

            if (result == null) {
                // Untuk kata pertama, inisialisasi result dengan menyalin (copy) set dari index
                // agar tidak mengubah data asli saat dilakukan retainAll nantinya
                result = new HashSet<>(index.get(w));
            } else {
                // Untuk kata berikutnya, lakukan irisan (retainAll)
                result.retainAll(index.get(w));
            }
        }

        return result == null ? new HashSet<>() : result;
    }

    // Kembalikan kata dengan total kemunculan (totalCount) terbesar.
    public String topWord() {
        if (totalCount.isEmpty()) return null;

        String bestWord = null;
        int maxCount = -1;

        for (Map.Entry<String, Integer> entry : totalCount.entrySet()) {
            String currentWord = entry.getKey();
            int currentCount = entry.getValue();

            // Jika count lebih besar, jadikan sebagai bestWord yang baru
            if (currentCount > maxCount) {
                maxCount = currentCount;
                bestWord = currentWord;
            }
            // Jika count sama, bandingkan secara alfabet menggunakan compareTo
            else if (currentCount == maxCount) {
                if (currentWord.compareTo(bestWord) < 0) {
                    bestWord = currentWord;
                }
            }
        }

        return bestWord;
    }
}
