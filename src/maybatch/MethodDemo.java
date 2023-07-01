package maybatch;

public class MethodDemo {

	int ins= 10;
	
	public static void main(String[] args) {
		MethodDemo demo1 = new MethodDemo();
//		int temp = demo1.sum(10, 20);
//		int temp2 = demo1.sum(temp, temp);
	
		/*
		double area = demo1.areaOfCircle(10);
		System.out.println(area);
		double area1 = demo1.areaOfCircleString("10");
		System.out.println(area1);
		*/
		System.out.println(demo1.ins);
		demo1.updateInstanceVariable(50);
		System.out.println(demo1.ins);
		
		
	}
	
	// Services 
	// give money  ->    ->  food
	// input - parameters
	// output
	
	// Sum method - it should add 2 values 
	
    	int sum (int i, int j){
    		int k = i + j;
    		return k;
    	}
    		
    	// Non Parameterised method
    	double valueOfPI (){
    		double piValue = 3.14d;
    		return piValue;
     	}
	
    	double areaOfCircle(double radius) {
    		// area = pi * r * r
    		double area = valueOfPI() * radius * radius;
    		return area;
    	}
    	
    	// non return type method - in void method , no return keyword
    	void updateInstanceVariable(int value) {
    		ins = value;
    	}
    	
    	
    	
    	// Documentation of method
    	// Dcoumentational comments
    	/**
    	 * hello this method will provide you area of circle
    	 * @param radius
    	 * @return return type is double
    	 */
    	double areaOfCircleString(String radius) {
    		// area = pi * r * r
    		double area = valueOfPI() * 
    				Double.parseDouble(radius) * 
    				Double.parseDouble(radius);
    		return area;
    	}
}



