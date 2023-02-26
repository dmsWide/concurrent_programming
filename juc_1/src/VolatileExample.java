public class VolatileExample {
    private volatile boolean flag = true;
    private void updateFlag(){
        flag = false;
        System.out.println("flag的值被更新了");
    }
    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        new Thread(() ->{
            while(volatileExample.flag){

            }
            System.out.println(Thread.currentThread().getName() + "结束");
        },"Thread1").start();
        new Thread(() ->{
            try{
                Thread.sleep(2000);
                volatileExample.updateFlag();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        },"Thread2").start();
    }
}
