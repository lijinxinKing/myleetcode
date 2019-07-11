package thread;

public class MyThread extends Thread {
    private String name;

    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        int i = 0;
        try {
            while (!Thread.currentThread().isInterrupted()){
                i++;
                System.out.println(Thread.currentThread().getState() + ", i = " + i) ;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
