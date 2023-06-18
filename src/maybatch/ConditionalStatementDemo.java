package maybatch;

public class ConditionalStatementDemo {

	// conditional Statement
	public static void main(String[] args) {
		// if condition
		// <18 = child
		// >18 < 30 = adult
		// >30 < 45 = mature
		// > 45 = old
		
		// boolean // comparison
		
		String ageGroup = "";
		int age = 10;
		if(age < 18) {
			ageGroup = "Child";
		}else if(age >= 18 && age <= 30) {
			ageGroup = "Adult";
		}else if(age > 30 && age <= 45) {
			ageGroup = "Mature";
		}else if(age > 45) {
			ageGroup = "Old";
		}
		System.out.println(ageGroup);
		
	}
	
}
