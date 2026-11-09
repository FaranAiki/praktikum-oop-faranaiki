import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Toolkit {
    // Mengembalikan elemen terbesar berdasarkan compareTo.
    public static <T extends Comparable<? super T>> T maxOf(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        T best = list.get(0);
        for (T item : list) {
            if (item.compareTo(best) > 0) {
                best = item;
            }
        }
        return best;
    }

    // Mengembalikan jumlah semua angka dalam collection.
    public static double sumAll(Collection<? extends Number> numbers) {
        double total = 0;
        for (Number n : numbers) {
            total += n.doubleValue();
        }
        return total;
    }

    // Menambahkan bilangan 1..n (Integer) ke akhir list.
    public static void appendRange(List<? super Integer> target, int n) {
        for (int i = 1; i <= n; i++) {
            target.add(i);
        }
    }

    // Mengembalikan list baru berisi hasil transform tiap elemen source.
    public static <I, O> List<O> mapAll(List<? extends I> source,
                                              Transformer<? super I, ? extends O> transformer) {
        List<O> result = new ArrayList<>();
        for (I item : source) {
            result.add(transformer.transform(item));
        }
        return result;
    }

    // Memasangkan elemen berindeks sama dari dua list.
    public static <A, B> List<Pair<A, B>> zip(List<A> first, List<B> second) {
        int size = Math.min(first.size(), second.size());
        List<Pair<A, B>> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(new Pair<>(first.get(i), second.get(i)));
        }
        return result;
    }
}
