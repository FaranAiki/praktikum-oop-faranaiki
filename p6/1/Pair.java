public class Pair<A, B> {
    private final A first;
    private final B second;

    public Pair(A first,B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    // Mengembalikan Pair baru dengan posisi elemen ditukar.
    public Pair<B, A> swap() {
        return new Pair<>(second, first);
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
