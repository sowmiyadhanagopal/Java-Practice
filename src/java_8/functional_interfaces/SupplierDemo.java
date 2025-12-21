package java_8.functional_interfaces;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Java 8 Supplier";
        System.out.println(supplier.get());
    }
}
