package list.concrete;

import list.LinkedList;
import list.ListElement;

public class StringList extends LinkedList<char[]> {

    public StringList(char[] data){
        concat(data);
    }

    public StringList(){}

    public void concat(char[] data){
        this.insert(data);
    }

    @Override
    public String toString(){
        return toStringRecusive(head, new StringBuilder());
    }

    private String toStringRecusive(ListElement<char[]> current, StringBuilder result){
        if(current == null){
            return result.toString();
        }
        return toStringRecusive(current.getNext(), result.append(current.getValue()));
    }

    public boolean isPalindrom(){
        //TODO
        return false;
    }

    @Override
    public void reverse(){
        //TODO
    }

    @Override
    public boolean contains(char[] value) {
        //TODO
        return false;
    }

}
