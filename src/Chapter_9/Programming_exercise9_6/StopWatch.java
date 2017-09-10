package Chapter_9.Programming_exercise9_6;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class StopWatch {
    private static long startTime;
    private long endTime;

    StopWatch(){

        startTime = System.currentTimeMillis();
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public long start(){
        return startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public  long getElapsedTime(){
        return endTime - startTime;
    }
}
