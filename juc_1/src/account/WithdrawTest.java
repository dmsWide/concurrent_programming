package account;

public class WithdrawTest {
    public static void main(String[] args) {
        Account account = new Account("AABBCC", 1000);
        new WithdrawThread("用户A",account,800).start();
        new WithdrawThread("用户B",account,800).start();
    }
}
