package ThreadsPractice;

public class RaceFixWithSync {

    public static void main(String[] args){

        Runnable runnable=new ThreadTest1();
        Thread t1=new Thread(runnable);

        Thread t2=new Thread(runnable);
        t1.start();
        t2.start();
    }
}

class ThreadTest1 implements Runnable{

    private static int count=0;
    @Override
    public void run() {
        try {
            increment();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public synchronized void increment() throws InterruptedException {
        for (int i=0;i<10;i++){
            Thread.sleep(1000);

            count++;
            System.out.println(count+" "+Thread.currentThread().getName());
        }
    }
}