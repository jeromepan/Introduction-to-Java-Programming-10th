package Chapter_6;
/*
 (Display patterns) Write a method to display a pattern as follows:
	1
	2 1
	3 2 1
	...
	n n-1 ... 3 2 1
	The method header is
	public static void displayPattern(int n)
 */

import java.util.Scanner;

public class Ecercise_6_6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int x = input.nextInt();
		dispalyPattern(x);
	}
	
	public static void dispalyPattern(int n){
		for(int i = 1; i <= n; i++){
			
			//for(int k = 1; k <= n - i; k++){
				
				//System.out.printf("%4s", "");
					
					//}
				
				for(int j = i; j >= 1; j-- ){
					
					System.out.printf("%4d",j);
				}
				
				System.out.println();
		}
	}
}
