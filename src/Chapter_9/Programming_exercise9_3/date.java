package Chapter_9.Programming_exercise9_3;

import java.util.Date;

/**
 * exercise 9.3 of textbook
 * Created by lmsj0 on 9/10/2017.
 */
public class date {
    public static void main(String [] args){
        long time = 10000;
       // Date da = new Date(time);

        for(int i = 1; i <= 8 ; i++){
            time *= 10;
            Date da = new Date(time);
            System.out.println(da.toString());
        }
    }
}
