package java_8.lambda;

interface Greeting {
    void sayHello();
}

public class LambdaIntroDemo {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello from Lambda");
        g.sayHello();
    }
}
