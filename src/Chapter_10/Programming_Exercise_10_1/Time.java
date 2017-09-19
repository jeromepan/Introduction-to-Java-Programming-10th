package Chapter_10.Programming_Exercise_10_1;

public class Time {
    private int hour;
    private int minute;
    private int second;


    //a no-arg constructor store the current time.
     Time(){
     long currentTime = System.currentTimeMillis();
     currentTime  += 3600000 * 5;
     currentTime += 60000 * 30;

     setTime(currentTime);

    }
    //single argument constructor
     Time(long elapseTime){
        setTime(elapseTime);
    }

    Time(int hour, int second, int minute){
         this.hour = hour;
         this.second = second;
         this.minute = minute;
    }

    public void setTime(long elapseTime){
        long totalSecond = elapseTime / 1000;
        this.second = (int)(totalSecond % 60);
        long totalMinute = totalSecond / 60;
        this.minute = (int)(totalMinute % 60);
        long totalHour = totalMinute / 60;
        this.hour = (int)(totalHour % 24);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond(){
        return second;
    }
}