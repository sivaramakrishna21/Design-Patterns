package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public abstract class TimeTaskExamples {

    public Timer timer;

    public TimeTaskExamples(Timer timer) {
        this.timer = timer;

    }

    public TimerTask createTask() {

        return new TimerTask() {
            @Override
            public void run() {
                System.out.println("performing some task");
                timer.cancel();
            }
        };
    }

    public TimerTask createnewsLetterTask(){
        return new NewsletterTask();
    }

    public abstract void executeTask();
}

class NewsletterTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Email sent at: "
                + LocalDateTime.ofInstant(Instant.ofEpochMilli(scheduledExecutionTime()), ZoneId.systemDefault()));
        Random random = new Random();
        int value = random.ints(1, 7)
                .findFirst()
                .getAsInt();
        System.out.println("The duration of sending the mail will took: " + value);
        try {
            TimeUnit.SECONDS.sleep(value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}