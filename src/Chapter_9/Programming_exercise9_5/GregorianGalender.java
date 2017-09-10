package Chapter_9.Programming_exercise9_5;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by lmsj0 on 9/10/2017.
 */
class Gregoriancalender {
    public static void main(String []args){
        //Date da = new Date();
        GregorianCalendar gre = new GregorianCalendar();

        System.out.print(gre.get(GregorianCalendar.YEAR) + " ");
        System.out.print(gre.get(GregorianCalendar.MONTH) + " ");
        System.out.print(gre.get(GregorianCalendar.DAY_OF_MONTH) + " ");


        System.out.println();
        //System.out.println(da);

        gre.setTimeInMillis(1234567898765L);
        System.out.print(gre.get(GregorianCalendar.YEAR) + " ");
        System.out.print(gre.get(GregorianCalendar.MONTH) + " ");
        System.out.print(gre.get(GregorianCalendar.DAY_OF_MONTH) + " ");
    }
}
