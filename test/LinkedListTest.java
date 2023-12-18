import helper.TestDataType;
import helper.TestObject;
import list.LinkedList;
import org.junit.Test;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest extends TestObject {

    @Test
    public void iteratorIntegerTest() {
        int len = 100;
        java.util.LinkedList<Integer> expected = new java.util.LinkedList<Integer>();
        LinkedList<Integer> actual = new LinkedList<>();
        fillRandomInteger(expected, actual,len, -1000, 100);
        compare(expected, actual);
    }

    @Test
    public void iteratorStringTest() {
        int len = 100;
        java.util.LinkedList<String> expected = new java.util.LinkedList<String>();
        LinkedList<String> actual = new LinkedList<>();
        fillRandomString(expected, actual,len,-1000, 100);
        compare(expected, actual);
    }

    @Test
    public void reverseIntegerTest() {
        int len = 100;
        java.util.LinkedList<Integer> expected = new java.util.LinkedList<Integer>();
        LinkedList<Integer> actual = new LinkedList<>();
        fillRandomInteger(expected, actual,len, -1000, 100);

        Collections.reverse(expected);
        actual.reverse();
        compare(expected, actual);

    }

    @Test
    public void reverseStringTest() {
        int len = 100;
        java.util.LinkedList<String> expected = new java.util.LinkedList<String>();
        LinkedList<String> actual = new LinkedList<>();
        fillRandomString(expected, actual, len, -1000, 100);
        compare(expected, actual);

        Collections.reverse(expected);
        actual.reverse();
        compare(expected, actual);
    }

    @Test
    public void containsInteger100Test() {
        int len = 100;
        java.util.LinkedList<Integer> expected1 = new java.util.LinkedList<Integer>();
        LinkedList<Integer> actual1 = new LinkedList<>();
        fillRandomInteger(expected1, actual1,len, -1000, 100);

        java.util.Iterator<Integer> expecteditInt = expected1.iterator();
        assertEquals(expected1.size(), actual1.getSize());

        while (expecteditInt.hasNext()){
            assertTrue(actual1.contains(expecteditInt.next()));
        }
    }

    @Test
    public void containsTestDataType100Test() {
        int len = 100;
        java.util.LinkedList<TestDataType> expected = new java.util.LinkedList<TestDataType>();
        LinkedList<TestDataType> actual = new LinkedList<TestDataType>();
        fillRandomTestDataType(expected, actual,len, -1000, 100);

        java.util.Iterator<TestDataType> expectedit = expected.iterator();
        assertEquals(expected.size(), actual.getSize());

        while (expectedit.hasNext()){
            assertTrue(actual.contains(expectedit.next()));
        }
    }
}
