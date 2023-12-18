import helper.TestObject;
import list.concrete.NumberList;
import org.junit.Test;
import java.util.stream.Collectors;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class NumberListTest extends TestObject {

    @Test
    public void invariantTest(){
        NumberList list = new NumberList();
        fillRandomInteger(new java.util.LinkedList<>(), list, 100, -100, 100);
        for(Integer i : list){
            assertTrue(i.intValue() >= 0 && i.intValue() <= 9);
        }
        assertTrue(list.getTail().getValue().intValue() != 0);
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

            String eString = "[" + (new StringBuilder((String.valueOf(i1.intValue() + i2.intValue()))).reverse()).toString().chars()
                    .mapToObj(c -> (char) c)
                    .map(Object::toString)
                    .collect(Collectors.joining(", ")) + "]";
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

            String eString = "[" + (new StringBuilder((String.valueOf(i1.intValue() + i2.intValue()))).reverse()).toString().chars()
                    .mapToObj(c -> (char) c)
                    .map(Object::toString)
                    .collect(Collectors.joining(", ")) + "]";
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
            String eString = "[" + (new StringBuilder((String.valueOf(i1.intValue() + i2.intValue()))).reverse()).toString().chars()
                    .mapToObj(c -> (char) c)
                    .map(Object::toString)
                    .collect(Collectors.joining(", ")) + "]";
            assertEquals(eString, NumberList.add(first, second).toString());
        }
    }


}
