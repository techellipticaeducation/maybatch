package humanchat;

public class Chatter {
	public static void main(String[] args) {
		// Nirav , Ayesha
		
		Human h1 = new Human();
		h1.name = "Nirav";
		h1.country = "India";
		h1.age = 25; 
				
		Human h2 = new Human();
		h2.name = "Ayesha";
		h2.country = "US";
		h2.age = 24;
		
		h1.speak("Hello");
		h2.speak("Hey! How r u?");
		
		Human h3 = new Human();
		h3.name = "Sufiyan";
		h3.country = "Aus";
		h3.age = 26;
		
		h3.speak("hey Guys! how r doing today ? ");
		h1.happyBirthday();
		h1.happyBirthday();
		h3.happyBirthday();
		h2.happyBirthday();
		
	}
}
