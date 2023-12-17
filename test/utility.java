import list.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class utility {
    public static class RandomWrapper{
        private Random rand;

        RandomWrapper(int seed){
            rand = new Random();
            rand.setSeed(seed);
        }

        public String getRandomString(int length){
            String res = "";
            for(int i = 0; i < length; ++i){
                res += (char) (getRandomInteger(33, 126).intValue());
            }
            return res;
        }

        public Integer getRandomInteger(int min, int max){
            return Integer.valueOf(min + rand.nextInt((max - min) + 1));
        }

        public Double getRandomDouble(int min, int max){
            return Double.valueOf(min + (max - min) * rand.nextDouble());
        }
        public String getRandomPalindrom(int length){
            String res = "";
            char c =  (char) (getRandomInteger(97, 122).intValue());
            if(length % 2 == 1){
             res += c;
            }
            for(int i = 0; i < length / 2; ++i){
                c = (char) (getRandomInteger(97, 122).intValue());
                res = c + res + c;
            }
            return res;
        }
    }
    public static class Pair<T, K>{
        T first;
        K second;

        public Pair(T first, K second) {
            this.first = first;
            this.second = second;
        }
    }


    public static List<char[]> partitionString(String input, int minPartitionLength, int maxPartitionLength) {
        if(input.length() == 0 || minPartitionLength > maxPartitionLength) {
            List<char[]> r = new ArrayList<>();
            r.add(input.toCharArray());
            return r;
        }
        List<char[]> partitions = new ArrayList<>();
        Random random = new Random();
        int inputLength = input.length();
        int currentIndex = 0;

        while (currentIndex < inputLength) {
            int partitionLength = random.nextInt(maxPartitionLength - minPartitionLength + 1) + minPartitionLength;

            int endIndex = Math.min(currentIndex + partitionLength, inputLength);
            partitions.add(input.substring(currentIndex, endIndex).toCharArray());

            currentIndex = endIndex;
        }

        return partitions;
    }

    public static java.util.LinkedList<Integer> tribonacciIteratve(int length){
        java.util.LinkedList<Integer> res = new java.util.LinkedList<Integer>();
        for(int i = 0; i < 3 && i < length; ++i){
            res.add(Integer.valueOf(1));
        }

        int last = 1;
        int secondLast = 1;
        int thirdLast = 1;

        for(int i = 3; i < length; ++i){
            int n = last + secondLast + thirdLast;
            thirdLast = secondLast;
            secondLast = last;
            last = n;
            res.add(Integer.valueOf(n));
        }
        return res;
    }
    public static boolean isPalindrom(String s){
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static boolean comapareCharArray(char[] first, char[] second){
        if(first.length != second.length){
            return false;
        }
        for(int j = 0; j < first.length; ++j){
            if(first[j] != second[j]){
                return false;
            }
        }
        return true;
    }

    public static <T> ArrayList<T> toArrayList(LinkedList<T> list){
        ArrayList<T> res = new ArrayList<>();
        for(T e : list){
            res.add(e);
        }
        return res;
    }
}
