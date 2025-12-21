package java_8.lambda;

public class LambdaWithParameterDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Runnable using lambda");
        r.run();
    }
}
