package org.example.lambda;

/*
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable,"myThread");
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
*/
class  MyRunnable{
    public static void main(String[] args) {
        Runnable r = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("child");
            }
        };
        new Thread(r).start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
