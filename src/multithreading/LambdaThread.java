package multithreading;
public class LambdaThread {

    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda thread: " + i);
            }
        };

        Thread t = new Thread(task);
        t.start();
    }
}
