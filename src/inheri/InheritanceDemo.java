package inheri;

public class InheritanceDemo {
	public static void main(String[] args) {
		C b1 = new C();
		b1.m2();
	}
}
// Constructor chain
class A{
	
	public A() {
		System.out.println("i am a construtor");
	}
	public A(int i) {
		System.out.println("i am a param construtor with "+i);
	}
	public void m1() {
		System.out.println("hello");
	}
}
// You cannot use super() and this() together in a constructor calls
class B extends A{
	public B() {
		super(10);
		// this must be the first statement in constructor
		// super must be the  first statement in constructor
		System.out.println("i am b construtor");
	}
	public void m2() {
//		m1();
	}
}
class C extends B{
	public C() {
		System.out.println("i am c construtor");
	}
	public void m3() {
		m2();
		m1();
	}
}
