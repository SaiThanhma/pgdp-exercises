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
        String res = "";
        list.ListElement<char[]> current = head;
        while(current != null){
            res += new String(current.getValue());
            current = current.getNext();
        }
        return res;
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
