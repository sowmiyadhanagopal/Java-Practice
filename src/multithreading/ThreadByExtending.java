package multithreading;
class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class ThreadByExtending {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // start() creates a new thread
    }
}
