package java_8.default_static_interface;

interface MyInterface {
    default void show() {
        System.out.println("Default method");
    }
}

public class DefaultMethodDemo implements MyInterface {
    public static void main(String[] args) {
        new DefaultMethodDemo().show();
    }
}
