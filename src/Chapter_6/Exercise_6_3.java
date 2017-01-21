package Chapter_6;

import java.util.Scanner;

/*
 * (Palindrome integer) Write the methods with the following headers
	// Return the reversal of an integer, i.e., reverse(456) returns 654
	 * 
	public static int reverse(int number)
	
	// Return true if number is a palindrome
	 * 
	public static boolean isPalindrome(int number)
	
	Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the
	user to enter an integer and reports whether the integer is a palindrome
 */

/*public class Exercise_6_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int testnumber = input.nextInt();
		System.out.println(isPalindrom(testnumber));
	}
	
	public static int reverse(int number){
		String str = Integer.toString(number);
		str = str.substring(str.length()-1) + str.substring(1, str.length()-1) + str.substring(0,1);
		number = Integer.parseInt(str);
		System.out.println(number);
		return number;
	}
	
	public static boolean isPalindrom(int number){
		boolean faith = true;
		if(reverse(number) == number){
			return faith;
			}else{
				return false;
			}
		}
}

*/

public class Exercise_6_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int testnumber = input.nextInt();
		System.out.println(isPalindrom(testnumber));
	}
	
	public static int reverse(int number){
		int x = 0;
		while(number%10 != 0){
			x += x%10;
			x *= 10;
			number = number/10;
			
			}
		return x;
		}

public static boolean isPalindrom(int number){
	//boolean faith = true;
	if(number == reverse(number))
	return true;
	else{
		return false;
	}
	}

}