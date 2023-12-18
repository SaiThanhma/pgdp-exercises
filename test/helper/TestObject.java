package helper;

import list.LinkedList;
import list.ListElement;
import org.junit.BeforeClass;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class TestObject {
    public static utility.RandomWrapper rand;

    @BeforeClass
    public static void setUpClass(){
        rand = new utility.RandomWrapper(42);
    }

    protected void fillInteger(java.util.LinkedList<Integer> e, LinkedList<Integer> a, Integer... elements){
        for(Integer element : elements){
            e.add(element);
            a.insert(element);
        }
    }

    protected void fillRandomInteger(java.util.LinkedList<Integer> e, LinkedList<Integer> a, int n, int min, int max){
        for(int i = 0; i < n; ++i){
            Integer j = rand.getRandomInteger(min, max);
            e.add(j);
            a.insert(j);
        }
    }

    protected void fillRandomDouble(java.util.LinkedList<Double> e, LinkedList<Double> a, int n, int min, int max){
        for(int i = 0; i < n; ++i){
            Double d = rand.getRandomDouble(min, max);
            e.add(d);
            a.insert(d);
        }
    }

    protected void fillRandomString(java.util.LinkedList<String> e, LinkedList<String> a, int n, int min, int max){
        for(int i = 0; i < n; ++i){
            String s = rand.getRandomString(rand.getRandomInteger(min, max));
            e.add(s);
            a.insert(s);
        }
    }

    protected void fillRandomTestDataType(java.util.LinkedList<TestDataType> e, LinkedList<TestDataType> a, int n, int min, int max){
        for(int i = 0; i < n; ++i){
            TestDataType d = new TestDataType(rand.getRandomInteger(min, max));
            e.add(d);
            a.insert(d);
        }
    }

    protected void  fillWithCharArrayRandom(java.util.LinkedList<char[]> e, LinkedList<char[]> a, String s){
        List<char[]> x = utility.partitionString(s, 1, s.length() /3);
        for(char[] chararr : x){
            e.add(chararr.clone());
            a.insert(chararr.clone());
        }
    }


    protected <T> void compare(java.util.LinkedList<T> expected, LinkedList<T> actual){
        assertEquals(actual.getSize(), expected.size());
        assertEquals(expected.size() > 0, actual.getHead() != null);

        ListElement<T> actualCurrent = actual.getHead();
        for(int i = 0; i < expected.size(); ++i){
            assertEquals(expected.get(i), actualCurrent.getValue());
            actualCurrent = actualCurrent.getNext();
        }
    }
}
