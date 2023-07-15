package inheri;

public class InheritanceDemo {
	public static void main(String[] args) {
		B b1 = new B();
		b1.m2();
	}
}
// Constructor chain
class A{
	
	public A() {
		System.out.println("i am a construtor");
	}
	
	public void m1() {
		System.out.println("hello");
	}
}

class B extends A{
	public B() {
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
