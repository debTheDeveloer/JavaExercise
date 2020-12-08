package Array;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayCheck {
    public static void main(String[] args) {
        Integer[] arrayInt = new Integer[4];
        arrayInt[3]=12;
        System.out.println(Arrays.toString(arrayInt));
        Stream<Integer> intStream = Stream.of(arrayInt);
    }
}
