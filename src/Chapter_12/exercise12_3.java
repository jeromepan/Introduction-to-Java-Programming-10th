package chpter12;

import java.util.Random;
import java.util.Scanner;

public class exercise12_3 {
    public static void main(String []args){
        int [] arr = new int [1000];
        Random ra = new Random();

        for (int i = 0; i< arr.length; i++){
            arr[i] = ra.nextInt();
        }


        Scanner input = new Scanner(System.in);

        boolean customInput = false;

        do{
            try{
                System.out.println("input an index of above array:");
                int index = input.nextInt();
                //System.out.println(arr[index]);
                int a = arr[index];
                System.out.println("the index " + index +" of array " + " is valid" + "  the value of that index is " + a );

                customInput = true;
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("out of Bounds ");
                //input.nextLine();
            }

        }while(!customInput);

    }
}
