package maybatch;

public class BitwiseOperator {
public static void main(String[] args) {
	
//	& | = bitwise
// && || = logical 	
	// AND
	// true & true  = true
	// true & false = false
	// false & true = false
	// false & false = false
	
//	System.out.println(returnTrue() && returnFalse());
	
	// OR
	// true | true  = true
	// true | false = true
	// false | true = true
	// false | false = false
	
//	System.out.println(returnTrue() | returnFalse());
}

public static boolean returnTrue() {
	System.out.println("return true");
	return true;
}
public static boolean returnFalse() {
	System.out.println("return false");
	return false;
}
}
