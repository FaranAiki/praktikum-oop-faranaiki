import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CreatureArchive {
    private final Set<String> creatures;

    public CreatureArchive() {
        // TODO: Inisialisasi creatures dengan HashSet kosong.
        creatures = new HashSet<>();
    }

    public boolean addCreature(String name) {
        // TODO: Tambahkan nama; true hanya jika nama belum ada.
        return creatures.add(name);
    }

    public boolean removeCreature(String name) {
        // TODO: Hapus nama; true hanya jika nama semula ada.
        return creatures.remove(name);
    }

    public boolean containsCreature(String name) {
        // TODO: Periksa apakah nama tercatat.
        return creatures.contains(name);
    }

    public int getUniqueCount() {
        // TODO: Kembalikan banyaknya nama unik.
        return creatures.size();
    }

    public List<String> getCreatures() {
        // TODO: Kembalikan salinan yang dapat dimodifikasi, terurut menaik.
        return creatures.stream().sorted().collect(Collectors.toList());
    }

    public List<String> getCommonCreatures(CreatureArchive other) {
        // TODO: Kembalikan irisan terurut tanpa mengubah kedua arsip.
        return creatures.stream().filter(other::containsCreature).sorted().collect(Collectors.toList());
    }
}
