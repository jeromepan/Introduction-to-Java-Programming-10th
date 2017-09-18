package Chapter_12.Example_textbook;

import java.util.Scanner;

/**
 * listing12.4 of textbook
 * Created by lmsj0 on 9/12/2017.
 */
public class Quotient {
    public static int quotient(int number1, int number2){
        if(number2 == 0){
            throw new ArithmeticException("Divisor cannot be zero");
            //return number1/number2;
        }
        return number1/number2;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integer");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
            int result = quotient(number1, number2);

            System.out.println(number1 + "/" + number2 + " is " + result);
        }
        catch(ArithmeticException ex){
            System.out.println("Exception: an integer " + "cannot be divided by zero.");
        }

        System.out.println("Execution continues>>>>>>");
    }
}
