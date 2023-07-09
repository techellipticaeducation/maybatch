package access1;

public class AM1 {

	// public -> visible every where
	// protected 
	// default -> visible only in package
	// private -> with in class
	
	// method and variable -> all 4 AM allowed
	// class -> public and default allowed
	int i = 10;
	private void m1() {
		
	}
	
	public static void main(String[] args) {
		AM1 am = new AM1();
		am.m1();
	}
}
