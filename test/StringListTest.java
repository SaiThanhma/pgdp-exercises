import helper.TestObject;
import helper.utility;
import list.concrete.StringList;
import org.junit.Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static helper.utility.reverseLinkedListWithCharArr;
import static org.junit.Assert.assertEquals;

public class StringListTest extends TestObject {

    @Test
    public void isPalindrome10Test(){
        int len = 10;
        String s;
        for(int i = 0; i < 10; ++i){
            s = rand.getRandomPalindrom(len);
            StringList list = new StringList();
            fillWithCharArrayRandom(new LinkedList<>(), list,s);
            assertEquals(utility.isPalindrom(s), list.isPalindrome());
        }
        for(int i = 0; i < 10; ++i){
            s = rand.getRandomString(len);
            StringList list = new StringList();
            fillWithCharArrayRandom(new LinkedList<>(), list,s);
            assertEquals(utility.isPalindrom(s), list.isPalindrome());
        }
    }

    @Test
    public void isPalindrome100Test(){
        int len = 100;
        String s;
        for(int i = 0; i < 100; ++i){
            s = rand.getRandomPalindrom(len);
            StringList list = new StringList();
            fillWithCharArrayRandom(new LinkedList<>(), list,s);
            assertEquals(utility.isPalindrom(s), list.isPalindrome());
        }
        for(int i = 0; i < 100; ++i){
            s = rand.getRandomString(len);
            StringList list = new StringList();
            fillWithCharArrayRandom(new LinkedList<>(), list, s);
            assertEquals(utility.isPalindrom(s), list.isPalindrome());
        }
    }

    @Test
    public void reverse10Test(){
        int len = 100;
        StringList actual = new StringList();
        LinkedList<char[]> expected = new LinkedList<>();
        fillWithCharArrayRandom(expected, actual,rand.getRandomString(len));
        var exp = reverseLinkedListWithCharArr(expected);

        actual.reverse();

        var acit = actual.iterator();
        var exit = exp.iterator();

        while (true){
            assertEquals(exit.hasNext(), acit.hasNext());
            if(!exit.hasNext()){
                break;
            }
            var e1 = exit.next();
            var e2 = acit.next();
            utility.comapareCharArray(e1, e2);
        }
    }

    @Test
    public void reverse100Test(){
        int len = 100;
        StringList actual = new StringList();
        LinkedList<char[]> expected = new LinkedList<>();
        fillWithCharArrayRandom(expected, actual,rand.getRandomString(len));
        var exp = reverseLinkedListWithCharArr(expected);
        actual.reverse();

        var acit = actual.iterator();
        var exit = exp.iterator();

        while (true){
            assertEquals(exit.hasNext(), acit.hasNext());
            if(!exit.hasNext()){
                break;
            }
            var e1 = exit.next();
            var e2 = acit.next();
            utility.comapareCharArray(e1, e2);
        }
    }

    @Test
    public void cointains10Test(){
        int len = 10;
        StringList actual = new StringList();
        LinkedList<char[]> expected = new LinkedList<>();
        fillWithCharArrayRandom(expected, actual, rand.getRandomString(len));
        String s = actual.toString();
        List<char[]> part = utility.partitionString(s, 1, s.length()/3);
        for(int j = 0; j < part.size(); ++j){
            assertEquals(s.contains(new String(part.get(j))), actual.contains(part.get(j)));
        }
    }

    @Test
    public void cointains100Test(){
        int len = 100;
        StringList actual = new StringList();
        LinkedList<char[]> expected = new LinkedList<>();
        fillWithCharArrayRandom(expected, actual, rand.getRandomString(len));
        String s = actual.toString();
        List<char[]> part = utility.partitionString(s, 1, s.length()/3);
        for(int j = 0; j < part.size(); ++j){
            assertEquals(s.contains(new String(part.get(j))), actual.contains(part.get(j)));
        }
    }

    @Test
    public void cointains1000Test(){
        int len = 1000;
        StringList actual = new StringList();
        LinkedList<char[]> expected = new LinkedList<>();
        fillWithCharArrayRandom(expected, actual, rand.getRandomString(len));
        String s = actual.toString();
        List<char[]> part = utility.partitionString(s, 1, s.length()/3);
        for(int j = 0; j < part.size(); ++j){
            assertEquals(s.contains(new String(part.get(j))), actual.contains(part.get(j)));
        }
    }
}
