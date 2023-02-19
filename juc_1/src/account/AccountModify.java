package account;

public class AccountModify {
    private String accountNo;
    private double balance;

    public AccountModify(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    //balance不允许随意修改所以不写setBalance()
    public synchronized void withdraw(int withdrawAmount){
        if(balance >= withdrawAmount){
                System.out.println("取出" + withdrawAmount + "元");
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                balance -= withdrawAmount;
                System.out.println("余额为" + balance);
        }else{
            System.out.println("余额不足");
        }
    }
}
