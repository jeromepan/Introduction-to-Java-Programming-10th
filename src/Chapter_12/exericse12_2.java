package chpter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exericse12_2 {
    public static void main(String [] args){
        System.out.println("input the integers you want to compute: ");
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean customerInput = false;

        do{
            try{
                System.out.println("input your answer: ");
                a = input.nextInt();
                b = input.nextInt();

                customerInput = true;

            }catch (InputMismatchException ex){
                System.out.println("input is invalid.");
                input.nextLine();//discard your input
            }

        }while (customerInput == false);

        System.out.println(a + " + " + b +" = " + (a+b));
    }
}
