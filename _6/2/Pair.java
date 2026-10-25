public class Pair<K, V> {
    // TODO: Buat dua atribut private untuk menyimpan nilai first (K) dan second (V)
    private K first;
    private V second;

    // TODO: Buat constructor dengan parameter first (K) dan second (V)
    public Pair(K fst, V snd) {
      first = fst; second = snd;
    }

    // TODO: Buat method getFirst() yang mengembalikan nilai first
    public K getFirst() { return this.first; }

    // TODO: Buat method getSecond() yang mengembalikan nilai second
    public V getSecond() { return this.second; }

    // TODO: Buat method swap() yang mengembalikan Pair dengan posisi dan tipe kedua nilai ditukar
    public Pair<V, K> swap() {
      return new Pair<V, K>(this.second, this.first);
    }

    // TODO: Buat generic method static twin(T value) yang mengembalikan Pair<T, T> dengan kedua nilai berisi value yang sama
    public static<T> Pair<T, T> twin(T value) {
      return new Pair<T, T>(value, value);
    }


    // TODO: Buat method isCompatible(Pair<?, ?> other) yang mengembalikan boolean
    // true jika tipe runtime (tipe sebenarnya yang paling spesifik) first dan second pada kedua Pair sama
    // false jika terdapat perbedaan tipe
    // Jika kedua nilai pada posisi yang sama adalah null, anggap kompatibel
    // Jika hanya salah satu yang null, anggap tidak kompatibel
    public boolean isCompatible(Pair<?, ?> other) {
        if (other == null) return false;

        boolean isFirstCompatible = (this.first == null && other.getFirst() == null) ||
          (this.first != null && other.getFirst() != null && this.first.getClass() == other.getFirst().getClass());

        boolean isSecondCompatible = (this.second == null && other.getSecond() == null) ||
          (this.second != null && other.getSecond() != null && this.second.getClass() == other.getSecond().getClass());

        return isFirstCompatible && isSecondCompatible;
    }

}
