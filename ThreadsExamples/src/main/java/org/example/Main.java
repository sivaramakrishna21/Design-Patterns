package org.example;

import java.util.Timer;


public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
//        TimeTaskExamples timeTaskExamples = new SingleTimeTask(timer);
//        timeTaskExamples.executeTask();

//        TimeTaskExamples particularTimeExample=new ParticularTimeTask(timer);
//        particularTimeExample.executeTask();

        RepeatableTimeTask repeatableTimeTask=new RepeatableTimeTask(timer);
        repeatableTimeTask.executeTask();

    }
}