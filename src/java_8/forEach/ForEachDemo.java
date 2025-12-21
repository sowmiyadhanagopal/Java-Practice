package java_8.forEach;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Boot");
        list.forEach(item -> System.out.println(item));
    }
}
