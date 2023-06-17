package maybatch;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Even-Odd Calculator");
		System.out.println("Enter You number");
		int input =scan.nextInt();
		String numberType = input%2==0 ? "even" : "odd";
		System.out.println(input + " is " +numberType);

		
	}
}
