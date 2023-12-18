import helper.TestObject;
import helper.utility;
import list.concrete.StringList;
import org.junit.Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class StringListTest extends TestObject {

    @Test
    public void isPalindromTest(){
        String s;
        for(int i = 0; i < 100; ++i){
            s = rand.getRandomPalindrom(i);
            StringList list = new StringList();
            fillWithCharArrayRandom(new LinkedList<>(), list,s);
            assertEquals(utility.isPalindrom(s), list.isPalindrome());
        }
        for(int i = 0; i < 100; ++i){
            s = rand.getRandomString(i);
            StringList list = new StringList();
            fillWithCharArrayRandom(new LinkedList<>(), list,s);
            assertEquals(utility.isPalindrom(s), list.isPalindrome());
        }
    }

    @Test
    public void reverseTest(){
        for(int i = 0; i < 1000; ++i){
            StringList actual = new StringList();
            LinkedList<char[]> expected = new LinkedList<>();
            fillWithCharArrayRandom(expected, actual,rand.getRandomString(i));
            Collections.reverse(expected);
            var exp = new LinkedList<char[]>(expected.stream().map(e->{
                for(int j = 0; j < e.length/2; ++j){
                    var tmp = e[j];
                    e[j] = e[e.length - 1 - j];
                    e[e.length - 1 - j] = tmp;
                }
                return e;
            }).toList());

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
    }

    @Test
    public void cointainsTest(){
        for(int i = 0; i < 500; ++i){
            StringList actual = new StringList();
            LinkedList<char[]> expected = new LinkedList<>();
            fillWithCharArrayRandom(expected, actual, rand.getRandomString(i));
            String s = actual.toString();
            List<char[]> part = utility.partitionString(s, 1, s.length()/3);
            for(int j = 0; j < part.size(); ++j){
                assertEquals(s.contains(new String(part.get(j))), actual.contains(part.get(j)));
            }
        }
    }
}
