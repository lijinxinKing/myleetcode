package thread;

import java.util.concurrent.ExecutorService;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();
        new Thread(
                new Runnable() {
                    public void run() {
                        System.out.println("Thread A is waiting to get lock");
                        synchronized (lock){
                            try {
                                System.out.println("Thread A get lock");
                                System.out.println("Thread A is sleeping");
                                Thread.sleep(20);
                                System.out.println("Thread A is Done");
                                lock.wait();
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }
                }
        ).start();

        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        new Thread(
                new Runnable() {
                    public void run() {
                        System.out.println("Thread B is waiting to get lock");
                        synchronized (lock){
                            try {
                                System.out.println("Thread B get lock");
                                System.out.println("Thread B is sleeping");
                                Thread.sleep(10);
                                System.out.println("Thread B is Done");
                                lock.notify();
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }
                }
        ).start();




    }
}
