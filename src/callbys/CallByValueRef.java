package callbys;

public class CallByValueRef {

	
	// which main method presentation is correct
	// public static void main(String...args) {
	// public static void main(String[] args) {
	
	
	public static void main(String...args) {
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add("fee" , 10));
		System.out.println(calc.add("expense",10,20,30,12,13,45));
		System.out.println(calc.add("game",10,5,23));
		System.out.println(calc.add("nothing"));
		System.out.println(calc.add("bus",10,20));
		
		
//		int i = 10;
//		int j = 15;
//		System.out.println(i); // 10
//		System.out.println(j); // 15
//		
//		calc.add(i, j);
//		
//		System.out.println("==========");
//		
//		System.out.println(i);
//		System.out.println(j);
		
		// call by value -> (data type) copy of value
		
//		calc.k = 50;
//		System.out.println(calc.k); // 50
//		calc.changeValue(calc);
//		System.out.println(calc.k); // 30
		// call by ref -> (object) actual	
	}
}
// varargs => when we dont know how many argument we are going to receive
class Calculator{
	
	int k = 10;
	
	public void changeValue(Calculator calc) {
		calc.k  = 30;
	}
	
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
//	public int add(int i , int j, int k) {
//		return i+j+k;
//	}
//	public int add(int i , int j, int k, int m) {
//		return i+j+k+m;
//	}
//	public int add(int i , int j, int k, int m, int n) {
//		return i+j+k+m+n;
//	}
}



