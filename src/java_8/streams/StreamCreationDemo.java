package java_8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamCreationDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++");
        list.stream().forEach(System.out::println);
    }
}
