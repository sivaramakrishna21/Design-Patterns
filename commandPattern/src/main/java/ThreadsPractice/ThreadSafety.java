package ThreadsPractice;

public class ThreadSafety {

    public static void main(String[] args){

        Runnable runnable=new ThreadTest();
        Thread t1=new Thread(runnable);

        Thread t2=new Thread(runnable);
        t1.start();
        t2.start();
    }
}

class ThreadTest implements Runnable{

    private static int count=0;
    @Override
    public void run() {
        try {
            increment();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void increment() throws InterruptedException {
        for (int i=0;i<10;i++){
            Thread.sleep(1000);

            count++;
            System.out.println(count+" "+Thread.currentThread().getName());
        }
    }
}