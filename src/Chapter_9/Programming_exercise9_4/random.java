package Chapter_9.Programming_exercise9_4;

import java.util.Random;

/**
 *
 * Created by lmsj0 on 9/10/2017.
 */
public class random {
    public static void main(String []args){
        Random ra = new Random(1000);
        for(int i = 1; i<= 50; i++){
            System.out.print(ra.nextInt(100) + " ");
        }
    }
}
