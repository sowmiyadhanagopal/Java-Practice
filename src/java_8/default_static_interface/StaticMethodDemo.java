package java_8.default_static_interface;

interface Utility {
    static void display() {
        System.out.println("Static method in interface");
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        Utility.display();
    }
}
