package Chapter_6;

public class Exercise_6_1 {
	/*
	 * (math: prntagonal numbers)
	 * A pentagonal number is defined as n(3n-1)/2 for n = 1, 2.....and so on. Therefore, the first few number are 1, 5, 12, 22>>>>>
	 * Write a method with the following header that returns a pentagonal number:
	 * 
	 * public static int getPentagonalNumber(int n)
	 * 
	 * write a test program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.
	 */
	public static void main(String[] args){
		for(int i = 1; i <= 100; i++){
			System.out.printf("%10s",(i % 8 != 0) ? getPentagonalNumber(i) + " " : getPentagonalNumber(i) + "\n");
		}
	}
	
	public static int getPentagonalNumber(int n){
		return  (n*(3*n - 1))/2;
	}

}
