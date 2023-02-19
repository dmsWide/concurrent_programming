package account;

public class WithdrawThreadModify extends Thread {
    private AccountModify account;
    private int withdrawAmount;

    public WithdrawThreadModify(String name,AccountModify account, int withdrawAmount) {
        super(name);
        this.account = account;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        //同步方法的同步监视器是this account调用withdraw那么this就代表account
        account.withdraw(withdrawAmount);
    }
}
