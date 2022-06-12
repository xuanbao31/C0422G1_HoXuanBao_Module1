package ss4_OOP.bai_tap;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;

    public StopWatch() {
        this.startTime = new Date();

    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = new Date();
        System.out.println(startTime);
    }

    public void stop() {
        endTime = new Date();
        System.out.println(endTime);
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}