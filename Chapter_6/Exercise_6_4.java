package Chapter_6;

import java.util.Scanner;

/*
 * (Display an integer reversed) Write a method with the following header to display
	an integer in reverse order:
	
	public static void reverse(int number)
	
	For example, reverse(3456) displays 6543. Write a test program that prompts
	the user to enter an integer and displays its reversal.
 */

public class Exercise_6_4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inter an integer: ");
		int x = input.nextInt();
		reverse(x);
	}
	
	public static void reverse(int number){
		int num = 0;
		while(number%10 != 0){
			num *= 10;
			num += number%10;
			number = number/10;
		}
		System.out.println(num);
	}
}
