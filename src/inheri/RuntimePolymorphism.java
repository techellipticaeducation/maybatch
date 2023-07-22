package inheri;

public class RuntimePolymorphism {
	public static void main(String[] args) {
		
		Car car1 = new Maruti();
		car1.carMethod();
		
	}
}



class Car{
	public void carMethod() {
		System.out.println("this is car method");
	}
}



class Maruti extends Car{

	public void carMethod() {
		System.out.println("this is maruti method");
	}
	public void marutiMethod() {
		System.out.println("i am car method");	
	}
}

class Truck{
	
}