import helper.TestDataType;
import helper.TestObject;
import helper.utility;
import list.concrete.SortedList;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SortedListTest extends TestObject {

    @Test
    public void insertInteger100Test() {
        int len = 100;
        SortedList<Integer> actual = new SortedList();
        fillRandomInteger(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));

    }

    @Test
    public void insertString100Test() {
        int len = 100;
        SortedList<String> actual = new SortedList();
        fillRandomString(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }

    @Test
    public void insertTD100Test() {
        int len = 100;
        SortedList<TestDataType> actual = new SortedList();
        fillRandomTestDataType(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }

    @Test
    public void insertDouble100Test() {
        int len = 100;
        SortedList<Double> actual = new SortedList();
        fillRandomDouble(new java.util.LinkedList<>(), actual, len, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
    }
}

