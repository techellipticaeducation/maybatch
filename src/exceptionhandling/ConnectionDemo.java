package exceptionhandling;

public class ConnectionDemo {
public static void main(String[] args) {
	
	
	try {
		System.out.println("Db connection");
		
		System.out.println("Sql Query execute");
		
	}catch (Exception e) {
		
	}finally {
		System.out.println("Connection close");
	}

	
	// try always need one helper (catch or finally)
	
	// if my query is correct -> 8,10, 15
	// if my query is wrong ->  8 ,10, 13, 15
	// connection close  - DB connection  
	
}
}
