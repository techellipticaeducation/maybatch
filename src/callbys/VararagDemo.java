package callbys;

public class VararagDemo {

	// which main method presentation is correct
	// public static void main(String...args) {
	// public static void main(String[] args) {
public static void main(String...args) {
	Calculator1 calc = new Calculator1();
	
	System.out.println(calc.add("fee" , 10));
	System.out.println(calc.add("expense",10,20,30,12,13,45));
	System.out.println(calc.add("game",10,5,23));
	System.out.println(calc.add("nothing"));
	System.out.println(calc.add("bus",10,20));
	
}
}

class Calculator1{
	
	// varargs must be last param of method
	// in one method only 1 varargs allowed
	public int add(String st,int...a) {
		System.out.println("Adding method running for " +st);
		int sum = 0;
		for(int i = 0 ; i < a.length ;i++) {
			sum = sum  + a[i];
		}
		return sum;
	}
}