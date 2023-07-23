package inheri;

public class StaticDemo {
	public static void main(String[] args) {
		F1 f2= new F2();
		f2.test1();
	}
}


class F1{
	public void test1() {
		System.out.println("F1->test1");
	}
}

class F2 extends F1{
	public void test1() {
		System.out.println("F2->test1");
	}
}