
public class SynchronizedLockObject implements Runnable{
    private static SynchronizedLockObject obj = new SynchronizedLockObject();
    Object obj1 = new Object();
    Object obj2 = new Object();
    @Override
    public void run() {
        synchronized (obj1){
            System.out.println("我是" + Thread.currentThread().getName());
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行结束");
        }
        synchronized (obj2){
            System.out.println("我是" + Thread.currentThread().getName() + "啦啦");
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行结束");
        }
        /*synchronized (this){
            System.out.println("我是" + Thread.currentThread().getName() + "啦啦");
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行结束");
        }*/
        synchronized (this){
            System.out.println("我是" + Thread.currentThread().getName());
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行结束");
        }
    }

    public static void main(String[] args) {
        new Thread(obj).start();
        new Thread(obj).start();
    }
}
