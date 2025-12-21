package java_8.method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python");
        list.forEach(System.out::println);
    }
}
