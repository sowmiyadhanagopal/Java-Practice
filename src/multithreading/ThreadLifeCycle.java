package multithreading;



public class ThreadLifeCycle {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("Thread is running");
        });

        System.out.println("State before start: " + t.getState());

        t.start();

        System.out.println("State after start: " + t.getState());
    }
}

