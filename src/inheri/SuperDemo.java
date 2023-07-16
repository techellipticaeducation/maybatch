package inheri;

public class SuperDemo {
	public static void main(String[] args) {
		K3 k2 = new K3();
		k2.parentm1();
	}
}

class K1{
	public void m1() {
		System.out.println("k1->m1");
	}
}


class K2 extends K1{
	public void m1() {
		System.out.println("k2->m1");
	}
}

class K3 extends K2{
	public void parentm1() {
		m1();
		super.m1(); // super keyword always check exact parent
	}
}