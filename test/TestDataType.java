public class TestDataType implements Comparable<TestDataType>{
    private int value;

    public TestDataType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TestDataType{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(TestDataType other) {
        return Integer.compare(this.value, other.value);
    }
}
