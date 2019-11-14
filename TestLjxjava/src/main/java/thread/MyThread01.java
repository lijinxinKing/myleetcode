package thread;

public class MyThread01 extends Thread{
    private int i = 0;

    public MyThread01(String threadName){
        super(threadName);
    }
    @Override
    public void run() {
        for (;i<100;i++){
            System.out.println("Name : " + Thread.currentThread().getName() + "," + i);
        }
    }

    public static void main(String[] args) {
        MyThread01 thread01 =  new MyThread01("新线程");
        thread01.setDaemon(true);
        thread01.start();
    }
}
