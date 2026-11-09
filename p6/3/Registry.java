public class Registry<L> {
    private final Object[] items;
    private int count;

    public Registry(int capacity) {
        this.items = new Object[capacity];
    }

    public boolean add(L item) {
        if (item == null || count >= items.length) {
            return false;
        }
        items[count++] = item;
        return true;
    }

    public boolean remove(L item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                for (int j = i; j < count - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[--count] = null;
                return true;
            }
        }
        return false;
    }

    public boolean contains(L item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return count;
    }

    @SuppressWarnings("unchecked")
    public L get(int index) {
        if (index < 0 || index >= count) {
            return null;
        }
        return (L) items[index];
    }
}
