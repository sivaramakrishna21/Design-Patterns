package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class RepeatableTimeTask extends TimeTaskExamples{
    public RepeatableTimeTask(Timer timer) {
        super(timer);
    }

    @Override
    public void executeTask() {
        TimerTask newsletterTask=createnewsLetterTask();
        timer.schedule(newsletterTask,0,1000);

    }
}
