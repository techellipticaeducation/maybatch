package inheri;

public class MethodOverridingDemo {
	public static void main(String[] args) {
		R2 obj = new R2();
		obj.m1();
		System.out.println(obj.i);
		
		// R1 -> 
		// R2 ->
		
		// parent - home - abc
		// child -  home - xyz
		// method overriding -> when parent and child having same signature method,
		// then child class over-ride parent method
		
		// public > protected > default > private
		// in overriding we cannot reduce visibility of method
		// private - overriding no applied
		// final keyword -> constant  , 
		// final method, variable, never overriding
		// final - class -> final classes we cannot extends , HAS-A Relationship
		
		 // The overriding method must have same return type (or subtype)

		
	}
}
// 50 object , i = 50 variable , k = 1  , m = 1 (actual constant)
class R1{
	final int i = 10; // constant in term of value
	static int k = 10; // constant in term of memory
	static final int m = 20; // value - constant, memory - constant
	
	public N2 m1() {
		
		k = 20;
		System.out.println("r1->m1");
		N2 n2 = new N2(); 
		return n2;
	}
}

class R2 extends R1{
	
	public N3 m1() {
		//i = 20;
		System.out.println("r2->m1");
		return null;
	}
}

class N1{
	
}
class N2 extends N1{
	
}
class N3 extends N2{
	
}




