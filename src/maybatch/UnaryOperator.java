package maybatch;

public class UnaryOperator {
public static void main(String[] args) {
	
	//  single operand
	// + , -
	
	int i  = 10;

	// pre increment ++i , first increase then assign
	// post increment i++, first assign then increase
	
	int j = i-- + --i + i-- + --i;
 //         10  +  8 + 8 + 6

	System.out.println(" i : "+ i);
	System.out.println(" j : "+ j);
	
	// increment operator ++,--   // by 1
	
	int k = 10;
	
//	i+=5;
	
	k+=3;
	k*=3;
	k/=3;
	k%=3;
	k-=3;
	System.out.println(k);
	
}
}
