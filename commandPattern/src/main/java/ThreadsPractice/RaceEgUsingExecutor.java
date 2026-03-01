package ThreadsPractice;

import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class RaceEgUsingExecutor {

//    ConcurrentHashMap
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        CalSum calSum=new CalSum();

        IntStream.range(0,100).forEach(count-> executorService.submit(calSum::increment));
        executorService.shutdown();
        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        System.out.println(calSum.getSum());
    }


}

class CalSum{
    private int sum=0;

    AtomicInteger atomicInteger=new AtomicInteger();
    public void increment(){

            atomicInteger.incrementAndGet();



    }

    public int getSum() {
        return atomicInteger.get();
    }

}