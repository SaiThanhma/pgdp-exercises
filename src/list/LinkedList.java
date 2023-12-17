package list;

public class LinkedList <T> implements Iterable<T>{

    protected ListElement<T> head;
    protected ListElement<T> tail;
    protected int size;

    public ListElement<T> getHead() {
        return head;
    }

    public void setHead(ListElement<T> head) {
        this.head = head;
    }

    public ListElement<T> getTail() {
        return tail;
    }

    public void setTail(ListElement<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void insert(T value) {
        //appends the value in the list
        ListElement<T> element = new ListElement<T>(value);
        if(size == 0){
            head = element;
            tail = element;
        }
        else {
            tail.next = element;
            tail = element;
        }
        ++size;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("[");
        ListElement<T> current = head;

        for (int i = 0; i < size; i++) {
            out.append(current.toString());
            if (i != size - 1) {
                out.append(", ");
            }
            current = current.next;
        }
        out.append("]");
        return out.toString();
    }

    public void reverse() {
        //TODO
    }

    public boolean contains(T value) {
        //TODO
        return false;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new Iterator(head);
    }

    public class Iterator implements java.util.Iterator<T> {
        //TODO

        public Iterator(ListElement<T> e) {
            //TODO
        }

        @Override
        public boolean hasNext() {
            //TODO
            return false;
        }

        @Override
        public T next() {
            //TODO
            return null;
        }
    }
}
