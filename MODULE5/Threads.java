package MODULE5;

class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread created using Thread class.");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread created using Runnable interface.");
    }
}

public class Threads {
    public static void main(String[] args) {

        // Using Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Using Runnable interface
        MyRunnable obj = new MyRunnable();
        Thread t2 = new Thread(obj);
        t2.start();
    }
}