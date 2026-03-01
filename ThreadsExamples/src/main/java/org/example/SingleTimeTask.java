package org.example;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class SingleTimeTask extends TimeTaskExamples {

    public SingleTimeTask(Timer timer) {
        super(timer);
    }

    @Override
    public void executeTask() {
        TimerTask timerTask=createTask();
        timer.schedule(timerTask,1000);

    }
}
