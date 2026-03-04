package MODULE5;

class MyThread extends Thread {

    public void run() {
        try {
            System.out.println("Thread is in RUNNING state");

            Thread.sleep(2000);   // TIMED_WAITING state
            System.out.println("Thread woke up from sleep");

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();

        // NEW State
        System.out.println("State after creation: " + t1.getState());

        // RUNNABLE State
        t1.start();
        System.out.println("State after start(): " + t1.getState());

        Thread.sleep(500);  // Give time to enter sleep
        System.out.println("State during sleep: " + t1.getState());

        t1.join();  // Wait until thread finishes

        // TERMINATED State
        System.out.println("State after completion: " + t1.getState());
    }
}