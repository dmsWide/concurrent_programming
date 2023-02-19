package account;

public class WithdrawThread extends Thread{
    //任何对象作为同步监视器 但是防止并发访问同一共享资源所以使用会被并发共享的资源作为同步监视器
    private Account account;
    private int withdrawAmount;

    public WithdrawThread(String name,Account account, int withdrawAmount) {
        super(name);
        this.account = account;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        synchronized (account){
            if(account.getBalance() >= withdrawAmount){
                System.out.println("取出" + withdrawAmount + "元");
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance() - withdrawAmount);
                System.out.println("余额为" + account.getBalance());
            }else{
                System.out.println("余额不足");
            }
        }
    }
}
