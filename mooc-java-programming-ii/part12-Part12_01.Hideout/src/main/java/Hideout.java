public class Hideout<T> {
    T hidden = null;
    public void putIntoHideout(T toHide) {
        this.hidden = toHide;
    }

    public T takeFromHideout() {
        T hidden = this.hidden;
        this.hidden = null;
        return hidden;
    }

    public boolean isInHideout() {
        return this.hidden != null;
    }
}
