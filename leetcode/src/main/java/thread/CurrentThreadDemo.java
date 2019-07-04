package thread;

public class CurrentThreadDemo {
    private static void attack(){
        System.out.println("Fight");
        System.out.println("Current Thread is: " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        Thread t = new Thread(){
            public void run(){
                attack();
            }
        };
        t.start();// 创建一个新子线程 并且启动
        // run 方法只是方法调用
        MyThread myThread1 = new MyThread("123-1");
        myThread1.run();
        myThread1.start();
        MyThread myThread2 = new MyThread("123-2");
        myThread2.run();
        MyThread myThread3 = new MyThread("123-3");
        myThread3.run();
    }
}
