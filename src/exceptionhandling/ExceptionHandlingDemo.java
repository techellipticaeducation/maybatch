package exceptionhandling;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		
		try {
			
			int[] ar = {10,20}; 
			ar[3] =10; 
			
			int i = 10;
			int j = 0;
			int k = i/j; // Java exception generate kiya
			System.out.println("Hello i am in try block");
		}catch(ArithmeticException e1) {
			System.out.println("plz chek your values . you should not be divisible by 0");			
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Plz check your array");
		}catch(Throwable e) {
			e.printStackTrace();
			System.out.println("for rest of exceptions");
		}
		//  catch block execute in sequence
		
		
		
		// can one try block have multiple catch block ? yes
		// sequence of catch is important. Never keep your Exception class your first catch block
		
		
		System.out.println("Hello this line1");
		System.out.println("Hello this line2");
		System.out.println("Hello this line3");
		
		// If you will not handle the exception . then it will kill your JVM
		
	}
}
