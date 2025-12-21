package java_8.functional_interfaces;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Java 8 Consumer");
    }
}
