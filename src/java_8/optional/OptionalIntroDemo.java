package java_8.optional;

import java.util.Optional;

public class OptionalIntroDemo {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");
        System.out.println(name.get());
    }
}
