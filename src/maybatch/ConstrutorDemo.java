package maybatch;

public class ConstrutorDemo {
	public static void main(String[] args) {

//		M3  obj = new M3("10");
//		// ref part = object part 
//
//		System.out.println(obj);


		// what ever class you are mentioning in object ,
		// that object will be created
		// new keyword - create the object

		// object creation is like gher banaya
		// plot -> Constructor
		// reserve you memory space -> Constructor
		// default constructor

		// obj.method1();

		// Construtor name must be same as class name
		// Constructor dont have return type

		// default  - non parameterized constructor
		
		// In a same class
		// method to method calling -> possible
		// constructor to method call -> possible
		// method to constructor call -> not possible
		// construtor to constructor -> possible (use this)
		
		// your constrctor calling must be first statement in constructor
		
		M3 m2 = new M3(10);
	}
}

class M3{
	// construtor
	M3(int i){
		this("abcd");
		System.out.println(i);
	}
	M3(int i, int j){

	}
	M3(String i){
		System.out.println(i);
	}
	
	
	
	
	void method1() {
		method2();
	}
	void method2() {
		method1();
	}
}
