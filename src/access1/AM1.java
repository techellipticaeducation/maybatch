package access1;

import access2.AM2;

public class AM1 {

	// public -> visible every where
	// protected -> visible in package + inherited class
	// default -> visible only in package
	// private -> with in class
	
	// method and variable -> all 4 AM allowed
	// class -> public and default allowed
	int i = 10;
	protected AM1() {
		
	}
	protected void m1() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		AM1 am = new AM1();
		am.m1();
	}
}

class AM4{
	public static void main(String[] args) {
		AM1 am = new AM1();
		am.m1();
	}
}
