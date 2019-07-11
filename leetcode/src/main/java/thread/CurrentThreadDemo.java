package thread;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

public class CurrentThreadDemo {
    private static void attack(){
        System.out.println("Fight");
        System.out.println("Current Thread is: " + Thread.currentThread().getName());
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        Thread t = new Thread(){
            public void run(){
                attack();
            }
        };
        t.start();// 创建一个新子线程 并且启动
        // run 方法只是方法调用
        MyThread myThread1 = new MyThread("123-1");
        myThread1.start();
        Thread.sleep(100);
        t.wait();// 处于等待队列的线程
        
        myThread1.interrupt();
        Thread.sleep(100);
        System.out.println(myThread1);
        ReentrantLock lock = new ReentrantLock(true);
        while (true){
            try{
                lock.lock();
                System.out.println();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }

    }
}
