package org.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;

public class ParticularTimeTask extends TimeTaskExamples {

    public ParticularTimeTask(Timer timer) {
        super(timer);
    }

    @Override
    public void executeTask() {
        LocalDateTime twoSecondslater = LocalDateTime.now().plusSeconds(2);
        Date twoSecondsLaterAsDate = Date.from(twoSecondslater.atZone(ZoneId.systemDefault()).toInstant());
        timer.schedule(createTask(),twoSecondsLaterAsDate);
    }


}
