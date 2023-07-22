package inheri;

import java.util.Scanner;

public class PaymentGatewayDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Total Amount");
		int amount = scan.nextInt();
		System.out.println("Payment Bank Name");
		String bank = scan.next();
		
		PaymentGateway gateway = null;
		if(bank.equals("HDFC")) {
			gateway = new HDFC();
		}else if(bank.equals("SBI")) {
			gateway= new SBI();
		}
		
		int process = gateway.processingFee();
		System.out.println(process);
		
		System.out.println("Total amount charged :  " + (amount+process));
	}
}
//  abstract class - implementation is mandatory
// abstract class - no body method - abstract - no object creation
// Partial Abstraction - ISA allowed , no HASA relationship
// final - HASA allowed ,  ISA  not allowed

//final and abstract together not allowed
// can we create object for abstract

abstract class PaymentGateway{
	public abstract int processingFee();
	public void m1() {		
	}
}

// Full abstraction
interface PaymentGateway1{
	public int processingFee();
}

class HDFC extends PaymentGateway{
	public int processingFee() {
		return 10;
	}
}
class SBI extends PaymentGateway{
	public int processingFee() {
		return 8;
	}
}
class Urban extends PaymentGateway{
	public int processingFee() {
		return 8;
	}
}