import list.LinkedList;
import org.junit.Test;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest extends TestObject {

    @Test
    public void iteratorTest() {
        java.util.LinkedList<Integer> expected1 = new java.util.LinkedList<Integer>();
        LinkedList<Integer> actual1 = new LinkedList<>();
        fillRandomInteger(expected1, actual1,100, -1000, 100);
        compare(expected1, actual1);


        java.util.LinkedList<String> expected2 = new java.util.LinkedList<String>();
        LinkedList<String> actual2 = new LinkedList<>();
        fillRandomString(expected2, actual2,100,-1000, 100);
        compare(expected2, actual2);
    }


    @Test
    public void reverseTest() {
        java.util.LinkedList<Integer> expected1 = new java.util.LinkedList<Integer>();
        LinkedList<Integer> actual1 = new LinkedList<>();
        fillRandomInteger(expected1, actual1,100, -1000, 100);

        Collections.reverse(expected1);
        actual1.reverse();
        compare(expected1, actual1);

        java.util.LinkedList<String> expected2 = new java.util.LinkedList<String>();
        LinkedList<String> actual2 = new LinkedList<>();
        fillRandomString(expected2, actual2,100, -1000, 100);
        compare(expected2, actual2);

        Collections.reverse(expected2);
        actual2.reverse();
        compare(expected2, actual2);
    }

    @Test
    public void containsTest() {
        java.util.LinkedList<Integer> expected1 = new java.util.LinkedList<Integer>();
        LinkedList<Integer> actual1 = new LinkedList<>();
        fillRandomInteger(expected1, actual1,100, -1000, 100);

        java.util.Iterator<Integer> expecteditInt = expected1.iterator();
        assertEquals(expected1.size(), actual1.getSize());

        while (expecteditInt.hasNext()){
            assertTrue(actual1.contains(expecteditInt.next()));
        }



        java.util.LinkedList<TestDataType> expected2 = new java.util.LinkedList<TestDataType>();
        LinkedList<TestDataType> actual2 = new LinkedList<TestDataType>();
        fillRandomTestDataType(expected2, actual2,100, -1000, 100);

        java.util.Iterator<TestDataType> expecteditTD = expected2.iterator();
        assertEquals(expected2.size(), actual2.getSize());

        while (expecteditInt.hasNext()){
            assertTrue(actual2.contains(expecteditTD.next()));
        }

    }

}
