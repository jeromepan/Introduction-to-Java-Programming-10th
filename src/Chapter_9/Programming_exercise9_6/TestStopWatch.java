package Chapter_9.Programming_exercise9_6;

import java.util.Random;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class TestStopWatch {
    public static void main(String [] args){
        int [] list = new int[100000];
        Random ra = new Random(100000);
        for(int i = 0; i<list.length; i++){
            list[i] = ra.nextInt();
        }

        StopWatch st = new StopWatch();

        st.start();
        selectionSort(list);
        st.stop();
        System.out.println("The selection sort begin at " + st.getStartTime() + " and end at " + st.getEndTime());
        System.out.println("The elapsed time is " + st.getElapsedTime() + "milliseconds  =  " + st.getElapsedTime()/1000 + "second");


    }



    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int currentMin = arr[i];
            int currentIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (currentMin > arr[j]) {
                    currentMin = arr[j];
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                arr[currentIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }
}
