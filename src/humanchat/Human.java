package humanchat;

public class Human {

	String name;
	static String country;
	int age;
	int height; 
	int vaibhav;
	
	
	Human(String name1, int age1){
		name = name1;
		age = age1;
	}
	Human(String name, String country,
			int age, int height){
		this.name = name;
		this.country = country;
		this.age = age;
		this.height = height;
		
	}
	
	
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
