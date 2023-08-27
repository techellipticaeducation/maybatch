package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class CheckExceptionDemo {
public static void main(String[] args) {
	
	try {
		FileInputStream stream = new FileInputStream(new File(""));
	}catch(Exception e) {
		
	}
}
}
