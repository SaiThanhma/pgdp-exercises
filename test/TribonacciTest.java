import helper.TestObject;
import helper.utility;
import list.concrete.TribonacciList;
import org.junit.Test;

public class TribonacciTest extends TestObject {

    @Test
    public void tribonacciN1ListTest(){
        int len = 1;
        var expected = utility.tribonacciIteratve(len);
        compare(expected, new TribonacciList(len));
    }

    @Test
    public void tribonacciN3ListTest(){
        int len =  3;
        var expected = utility.tribonacciIteratve(len);
        compare(expected, new TribonacciList(len));
    }

    @Test
    public void tribonacciN10ListTest(){
        int len =  10;
        var expected = utility.tribonacciIteratve(len);
        compare(expected, new TribonacciList(len));
    }

    @Test
    public void tribonacciListN40Test(){
        int len =  40;
        var expected = utility.tribonacciIteratve(len);
        compare(expected, new TribonacciList(len));
    }

    @Test
    public void insertN10Test(){
        int len = 5;
        int add = 5;
        var expected = utility.tribonacciIteratve(len + add);
        TribonacciList actual = new TribonacciList(len);
        actual.insert(add);
        compare(expected, actual);
    }

    @Test
    public void insertN20Test(){
        int len = 5;
        int add = 15;
        var expected = utility.tribonacciIteratve(len + add);
        TribonacciList actual = new TribonacciList(len);
        actual.insert(add);
        compare(expected, actual);
    }

    @Test
    public void insertN40Test(){
        int len = 30;
        int add = 10;
        var expected = utility.tribonacciIteratve(len + add);
        TribonacciList actual = new TribonacciList(len);
        actual.insert(add);
        compare(expected, actual);
    }

}
