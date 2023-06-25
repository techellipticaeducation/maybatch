package humanchat;

public class Human {

	String name;
	static String country;
	int age;
	int height; 
	
	int j = i;
	static int i = 10;
	
	
	 // Instance variable /object variable - object creation ke time per bante hian 
   	// static - shared , memory fix - wo class loading ke time . classes.varibale name
	// static - instance
	
	
	
	public void speak(String content) {
		System.out.println(name +"["+country+"]" + " - " + content);
	}
	public void happyBirthday() {
		age++;
		System.out.println("Happy Birthday " + name + "! Your age is " +age);
	}
}
