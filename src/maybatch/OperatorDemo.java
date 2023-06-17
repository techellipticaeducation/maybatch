package maybatch;

public class OperatorDemo {
	public static void main(String[] args) {
		// Arithmatic operator
//		+
//		-
//		*
//		/
//		%
		
		// * / %   ==  multiplicative (left to right)
		// +  -    == addition 
		
		int i = 10;
		int j = 7;
		
		
		System.out.println(i+j); // 17
		System.out.println(i-j); // 3
		System.out.println(i*j); // 70
		System.out.println((float)i/(float)j); // 1.4
		System.out.println(i%j); // 3

		//BODMAS
		// 3 % 6 * 4     =  
		// 3 * 4 =  12
		
		// 3 * 6 % 4 
		// 18 % 4 = 2
		
	}
}
