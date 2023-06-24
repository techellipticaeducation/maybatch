package humanchat;

public class Human {

	String name;
	String country;
	int age;
	
	public void speak(String content) {
		System.out.println(name +"["+country+"]" + " - " + content);
	}
	public void happyBirthday() {
		age++;
		System.out.println("Happy Birthday " + name + "! Your age is " +age);
	}
}
