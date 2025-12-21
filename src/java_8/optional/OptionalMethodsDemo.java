package java_8.optional;

import java.util.Optional;

public class OptionalMethodsDemo {
    public static void main(String[] args) {
        Optional<String> value = Optional.empty();
        System.out.println(value.orElse("Default Value"));
    }
}
