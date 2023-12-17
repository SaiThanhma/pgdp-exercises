package list;

public class ListElement<T> {
    protected T value;
    protected ListElement<T> next;

    public ListElement(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(ListElement<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public ListElement<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    //TODO: Implement helper function if needed
}
