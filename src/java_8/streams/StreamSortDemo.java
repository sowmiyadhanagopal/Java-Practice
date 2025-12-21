package java_8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamSortDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,1,3,2);
        nums.stream().sorted().forEach(System.out::println);
    }
}
