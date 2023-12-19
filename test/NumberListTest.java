import helper.TestObject;
import list.concrete.NumberList;
import org.junit.Test;
import java.util.stream.Collectors;

import static helper.utility.expectedAddString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NumberListTest extends TestObject {

    @Test
    public void invariantTest(){
        NumberList actual = new NumberList();
        fillRandomInteger(new java.util.LinkedList<>(), actual, 100, -100, 100);
        for(Integer i : actual){
            assertTrue(i.intValue() >= 0 && i.intValue() <= 9);
        }
        assertTrue(actual.getTail().getValue().intValue() != 0);
    }

    @Test
    public void insertNegativeTest(){
        for(int i = 0; i < 5; ++i){
            NumberList actual = new NumberList();
            fillRandomInteger(new java.util.LinkedList<>(), actual, 1, -1000, -1);
            assertTrue(actual.getSize() == 0);
        }
    }

    @Test
    public void insert3DigitTest(){
        Integer i = Integer.valueOf(rand.getRandomInteger(100, 999));
        NumberList actual = new NumberList(i);

        String eString = "[" + (new StringBuilder(i.toString()).reverse()).toString().chars()
                .mapToObj(c -> (char) c)
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + "]";

        assertEquals(eString, actual.toString());
    }

    @Test
    public void insert9DigitTest(){
        Integer i = Integer.valueOf(rand.getRandomInteger(100000000, 999999999));
        NumberList actual = new NumberList(i);

        String eString = "[" + (new StringBuilder(i.toString()).reverse()).toString().chars()
                .mapToObj(c -> (char) c)
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + "]";

        assertEquals(eString, actual.toString());
    }

    @Test
    public void crossSum3DigitTest(){
        Integer i = Integer.valueOf(rand.getRandomInteger(100, 999));
        NumberList actual = new NumberList(i);

        int sum = String.valueOf(i)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        assertEquals(sum, actual.crossSum().intValue());
    }

    @Test
    public void crossSum9DigitTest(){
        Integer i = Integer.valueOf(rand.getRandomInteger(100000000, 999999999));
        NumberList actual = new NumberList(i);

        int sum = String.valueOf(i)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        assertEquals(sum, actual.crossSum().intValue());
    }

    @Test
    public void add3DigitTest(){
        for(int i = 0; i < 100; ++i) {
            Integer i1 = Integer.valueOf(rand.getRandomInteger(0, 999));
            Integer i2 = Integer.valueOf(rand.getRandomInteger(0, 999));
            NumberList first = new NumberList(i1);
            NumberList second = new NumberList(i2);

            String eString = expectedAddString(i1, i2);
            assertEquals(eString, NumberList.add(first, second).toString());
        }
    }

    @Test
    public void add5DigitTest(){
        for(int i = 0; i < 100; ++i) {
            Integer i1 = Integer.valueOf(rand.getRandomInteger(0, 99999));
            Integer i2 = Integer.valueOf(rand.getRandomInteger(0, 99999));
            NumberList first = new NumberList(i1);
            NumberList second = new NumberList(i2);

            String eString = expectedAddString(i1, i2);
            assertEquals(eString, NumberList.add(first, second).toString());
        }
    }

    @Test
    public void add7DigitTest(){
        for(int i = 0; i < 100; ++i) {
            Integer i1 = Integer.valueOf(rand.getRandomInteger(0, 9999999));
            Integer i2 = Integer.valueOf(rand.getRandomInteger(0, 9999999));
            NumberList first = new NumberList(i1);
            NumberList second = new NumberList(i2);
            String eString = expectedAddString(i1, i2);
            assertEquals(eString, NumberList.add(first, second).toString());
        }
    }
}
