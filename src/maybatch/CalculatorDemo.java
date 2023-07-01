package maybatch;

public class CalculatorDemo {
public static void main(String[] args) {
	
	double k = Calculator.sum(10.89d, 20);
	System.out.println(k);
	
	Calculator cal = new Calculator();
	cal.sum(10, 12);
	
}
}


class Calculator{
	
	// Method Overloading - number of parameter and type of parameter  
	// Poly-morphism  in java - Compile time polymorphism
	
//	Rules 
	// 1 - number of param should be different
	// 2 - type of param should be different
	// 3 - return have no impact on method overloading
	
	// static method and non static method
	
//	static
//  static method	
	
//	instance
//  non-static method
	
	
	
//	Calling Rules
	// to call static method, we don't need any object.
	// in non static method, we can call all variable
	// in static method, we can only use static variables
	
	// can we overload main method ? 
	// Array and String
	
	int i;
	static int k;
	
	static void test1() {
		//System.out.println(i);
		System.out.println(k);
	}
	
	int sum(int i , int j) {
		return i+j;
	}
	
	static int sum(int i ,int j, int k) {
		return i+j+k;
	}
	
	static double sum(double i , int j) {
		return i+j;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	int substarct(int i , int j) {
		return i-j;
	}
	
}
