package callbys;

public class CallByValueRef {

	public static void m1(Integer in) {
		in = 10;
	}
	
	
	public static void main(String...args) {
		
		Integer h = new Integer(20);
		m1(h);
		System.out.println(h);
		
		Calculator calc = new Calculator();
		
		
		
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
	
	
	public void add(int i , int j) {
		i = 20;
		j = 40;
	}
}



