package thread;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String accountNo;

    private final ReentrantLock lock = new ReentrantLock();
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;
    public Account(String accountNo,double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    // 同步方法，同步监视器是this, 修饰代码块
    // 不能修饰构造器 成员变量
    public synchronized void draw(double drawAmount){
        if(balance >= drawAmount){
            System.out.println(Thread.currentThread().getName() + "取钱成功" + drawAmount);
        }

    }
}
