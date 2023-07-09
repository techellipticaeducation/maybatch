package humanchat;

public class Chatter {
	public static void main(String[] args) {
		// Nirav , Ayesha
		
		Human.country = "India";
		
		Human h1 = new Human("Nirav","India",25,135);
		h1.country = "Pakistan";
		Human h2 = new Human("Ayesha","India",24,156);
		
		System.out.println(h2.country);
		
		h1.age = 34;
		
		Human h5 = h2;
		h1.speak("Hello");
		h5.speak("Hey! How r u?");
		
		Human h3 = new Human("Sufiyan",26);
		
		
		
		h3.speak("hey Guys! how r doing today ? ");
		h1.happyBirthday();
		h1.happyBirthday();
		h3.happyBirthday();
		h5.happyBirthday();
		
	}
}
