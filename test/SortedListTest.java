import helper.TestDataType;
import helper.TestObject;
import helper.utility;
import list.concrete.SortedList;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SortedListTest extends TestObject {

    @Test
    public void insertIntegerTest() {
        SortedList<Integer> actual = new SortedList();
        fillRandomInteger(new java.util.LinkedList<>(), actual, 100, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));

    }

    @Test
    public void insertStringTest() {
        SortedList<String> actual = new SortedList();
        fillRandomString(new java.util.LinkedList<>(), actual, 100, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));
        System.out.println(actual);

    }
    @Test
    public void insertTDTest() {
        SortedList<TestDataType> actual = new SortedList();
        fillRandomTestDataType(new java.util.LinkedList<>(), actual, 100, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));

    }

    @Test
    public void insertDoubleTest() {
        SortedList<Double> actual = new SortedList();
        fillRandomDouble(new java.util.LinkedList<>(), actual, 100, -1000, 100);
        var isSorted = utility.toArrayList(actual);
        assertTrue(isSorted.stream().sorted().toList().equals(isSorted));

    }
}

