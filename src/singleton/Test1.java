package singleton;

public class Test1 {
	public static void main(String[] args) {
		for(int i = 1 ; i <=  10; i++) {
			TestSuite suite = TestSuite.getBrowser();
			System.out.println(suite);
		}
		
		// browser // new browser open
		// Singleton = Single object in tons of object calling
		
//		static  
		
		// make your constructor private
		// create one static method which return class object
		// object as static with if condition
		
	}
}


class TestSuite{
	static int i = 0;
	static TestSuite suite = null;
	
	
	private TestSuite() {
		
	}
	
	public static TestSuite getBrowser() {
		if(suite == null) {
			TestSuite.suite = new TestSuite();
		}
		return suite;
	}
	
	
	public void test1() {
		System.out.println("important function");
	}
}


