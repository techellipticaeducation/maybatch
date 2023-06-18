package maybatch;

import java.util.Scanner;

public class SumOfDigitDemo {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Sum digit Calculator");
		
		while(true) {
			System.out.println("Enter your number : ");
			int i = scan.nextInt();
			int temp = i;
			int sum = 0;
			while(i != 0) {
				sum = sum + i%10;
				i = i/10;
			}
			System.out.println("Sum of " + temp + " is " + sum);
		}
		
//		i%10;  // 234%10 = 4
//		i/10  //  234/10 = 23
//		
//		i%10 // 23%10 = 3
//		i/10 // 2/10 = 2
//		
//		i%10 // 2%10 = 2
//		i/10 // 2/10 = 0
//		
//		i%10 // 0%10 = 0
//		i/10 // 0/10 = 0
	
	}
}
