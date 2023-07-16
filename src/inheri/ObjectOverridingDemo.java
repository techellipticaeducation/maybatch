package inheri;

public class ObjectOverridingDemo {
public static void main(String[] args) {
	D2 d1= new D2();
	System.out.println(d1);
	//System.out.println(d1.toString());
}
}




class D1{

	@Override
	public String toString() {
		System.out.println("Hello ! i am your new sysout");
		return "hello";
	}
	
}

class D2 extends D1{
	
}