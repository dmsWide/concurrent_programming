package account;

public class WithdrawTestMdify {
    public static void main(String[] args) {
        AccountModify account = new AccountModify("AABBCC", 1000);
        new WithdrawThreadModify("用户A",account,800).start();
        new WithdrawThreadModify("用户B",account,800).start();
    }
}
