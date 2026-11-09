public class NumberBox<T extends Number> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }

    // Menerima NumberBox dengan jenis angka apa pun.
    public boolean isGreaterThan(NumberBox<?> other) {
        return doubleValue() > other.doubleValue();
    }
}
