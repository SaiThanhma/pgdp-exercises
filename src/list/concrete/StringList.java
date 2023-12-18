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

    public int length(){
        return lengthRecursive(head, 0);
    }

    private int lengthRecursive(ListElement<char[]> current, int result){
        if(current == null){
            return result;
        }
        return lengthRecursive(current.getNext(), result + current.getValue().length);
    }

    @Override
    public String toString(){
        return toStringRecursive(head, new StringBuilder());
    }

    private String toStringRecursive(ListElement<char[]> current, StringBuilder result){
        if(current == null){
            return result.toString();
        }
        return toStringRecursive(current.getNext(), result.append(current.getValue()));
    }

    public boolean isPalindrome(){
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
