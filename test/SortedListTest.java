import helper.TestDataType;
import helper.TestObject;
import helper.utility;
import list.concrete.SortedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SortedListTest extends TestObject {

    @Test
    public void insertInteger20Test() {
        int len = 20;
        SortedList<Integer> actual = new SortedList();
        fillRandomInteger(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertEquals(isSorted.size(), len);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }

    @Test
    public void insertInteger100Test() {
        int len = 100;
        SortedList<Integer> actual = new SortedList();
        fillRandomInteger(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertEquals(isSorted.size(), len);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }

    @Test
    public void insertString20Test() {
        int len = 20;
        SortedList<String> actual = new SortedList();
        fillRandomString(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertEquals(isSorted.size(), len);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }

    @Test
    public void insertString100Test() {
        int len = 100;
        SortedList<String> actual = new SortedList();
        fillRandomString(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertEquals(isSorted.size(), len);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }

    @Test
    public void insertTD20Test() {
        int len = 20;
        SortedList<TestDataType> actual = new SortedList();
        fillRandomTestDataType(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertEquals(isSorted.size(), len);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }


    @Test
    public void insertTD100Test() {
        int len = 100;
        SortedList<TestDataType> actual = new SortedList();
        fillRandomTestDataType(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertEquals(isSorted.size(), len);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }

    @Test
    public void insertDouble20Test() {
        int len = 20;
        SortedList<Double> actual = new SortedList();
        fillRandomDouble(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertEquals(isSorted.size(), len);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }

    @Test
    public void insertDouble100Test() {
        int len = 100;
        SortedList<Double> actual = new SortedList();
        fillRandomDouble(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertEquals(isSorted.size(), len);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }
}