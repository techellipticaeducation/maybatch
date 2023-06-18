package maybatch;

public class MaxNumber {

	public static void main(String[] args) {
		int i = 100;
		int j = 60;
		int k = 45;
		
		
		int vaibha = 0 ;
		if(i > j) {
			vaibha = i;
		}else {
			vaibha = j;
		}
		
		if(vaibha > k) {
			System.out.println("max value = " + vaibha);
		}else {
			System.out.println("max value = " + k);
		}
		
//		if(i > j) {
//			System.out.println(i + " is greater than " + j);
//		}else if(i == j) {
//			System.out.println(j + " is equals " + i);			
//		}else {
//			System.out.println(j + " is greater than " + i);			
//		}
		
	}
}
