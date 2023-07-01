package humanchat;

public class Chatter {
	public static void main(String[] args) {
		// Nirav , Ayesha
		
		//Human.country = "India";
		
		Human h1 = new Human();
		h1.name = "Nirav";
		h1.age = 25; 
		h1.height = 135;
		h1.country = "India";
		
		
		Human h2 = new Human();
		h2.name = "Ayesha";
		h2.age = 24;
		h2.height = 156;
		h2.country = "India";
		
		Human h5 = h2;
		h1.speak("Hello");
		h5.speak("Hey! How r u?");
		
		Human h3 = new Human();
		h3.name = "Sufiyan";
		h3.age = 26;
		
		h3.speak("hey Guys! how r doing today ? ");
		h1.happyBirthday();
		h1.happyBirthday();
		h3.happyBirthday();
		h5.happyBirthday();
		
	}
}
