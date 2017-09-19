package Chapter_10.Programming_Exercise_10_1;

import java.awt.*;

public class TestTime {
    public static void main(String [] args){
        Time time = new Time();
        Time time1 = new Time(555550000);

        System.out.println("Time1: " + time.getHour() + " : " + time.getMinute() + " : " + time.getSecond());
        System.out.println("Time2: " + time1.getHour() + " : " + time.getMinute() + " : " + time1.getSecond());
    }
}
