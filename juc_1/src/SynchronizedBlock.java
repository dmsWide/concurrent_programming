public class SynchronizedBlock implements Runnable{
    private int num;

    public SynchronizedBlock(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(num < 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("线程: " + Thread.currentThread().getName() + "打印i的值: " + num--);
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedBlock synchronizedBlock = new SynchronizedBlock(1000);
        new Thread(synchronizedBlock).start();
        new Thread(synchronizedBlock).start();
        new Thread(synchronizedBlock).start();
    }
}
