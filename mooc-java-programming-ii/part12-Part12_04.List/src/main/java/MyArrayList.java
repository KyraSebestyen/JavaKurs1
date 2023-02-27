public class MyArrayList<T> {
    private T[] values = (T[]) new Object[10];
    private int firstFreeIndex = 0;

    public void add(T value) {
        if (!this.freeIndexExists()) {
            this.grow();
        }
        values[firstFreeIndex] = value;
        firstFreeIndex++;

    }

    public void remove(T value) {
        int index = findIndexOf(value);
        if (index >= 0) {
            values[index] = null;
            removeEmptySlots();
            firstFreeIndex--;
        }
    }

    public boolean contains(T value) {
        return findIndexOf(value) > 0;
    }

    public int size() {
        return this.values.length;
    }

    public T value(int atIndex) {
        if (atIndex < size()) {
            return values[atIndex];
        }
        return null;
    }

    private boolean freeIndexExists() {
        return this.firstFreeIndex < this.values.length;
    }

    private void grow() {
        int newLength = this.values.length + this.values.length / 2;
        T[] newValues = (T[]) new Object[newLength];
        System.arraycopy(values, 0, newValues, 0, values.length);
        this.values = newValues;
    }

    private int findIndexOf(T value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
                continue;
            }
            if (values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void removeEmptySlots() {
        T[] newValues = (T[]) new Object[values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                newValues[i] = values[i];
            }
        }
        values = newValues;
    }
}
