import list.concrete.TribonacciList;
import org.junit.Test;

public class TribonacciTest extends TestObject{

    @Test
    public void TribonacciListTestN1(){
        int len = 1;
        var expected = utility.tribonacciIteratve(len);
        compare(expected, new TribonacciList(len));
    }

    @Test
    public void TribonacciListTestN3(){
        int len =  3;
        var expected = utility.tribonacciIteratve(len);
        compare(expected, new TribonacciList(len));
    }

    @Test
    public void TribonacciListTestN10(){
        int len =  10;
        var expected = utility.tribonacciIteratve(len);
        compare(expected, new TribonacciList(len));
    }

    @Test
    public void TribonacciListTestN40(){
        int len =  40;
        var expected = utility.tribonacciIteratve(len);
        compare(expected, new TribonacciList(len));
    }

}
