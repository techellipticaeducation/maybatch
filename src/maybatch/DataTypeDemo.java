package maybatch;

public class DataTypeDemo {
	public static void main(String[] args) {
		// Data-type = data + type
		
		//  4 categories
		// numerical
		
		// byte  - 1 byte , 8 bits , 0 to 255 (positive)  = 256 , (-128 to 127)
		// (-) 2 power (bits-1) to     (2 power (bits-1) -1) 
		// (-) 2 power (7) to  (2 power (7) -1)
		//  -128 to 127
// 		byte b1 = (byte)300;
//		System.out.println(b1);
		
		// short - 2 byte = 16 bits
		// (-) 2 power (bits-1) to     (2 power (bits-1) -1) 
		// - 2 power 15 to (2 power 15)-1
		// -32768 to 32767
		
		// int  -  4 byte = 32 bits
		// -(2 power 31) to [(2 power 31) -1]
		
		//long k = 0X10;
		// if 0 - that become octal
		// if 0X - hexadecimal
		//System.out.println(k);
//		int m = 12_34;
//		m = m +1;
//		System.out.println(m);
//		long k = 1234_6789_2536_9836L;
//		System.out.println(k);
		
		// long  - 8 byte = 64 bits
		// -(2 power 63) to [(2 power 63) -1]
		
		
		
//		floating
		
//		float fl; // 4 byte   1.54
//		double db; // 8 byte  2.64
		
		
		// boolean , true, false, 1 bit
//		boolean j = true;
//		boolean m = false;
		
		// character
		// ASCII - 1 byte
		// Unicode - 2byte
		
		char ch = 'a';
		int l = (int)ch;
		System.out.println(l);
		
		int m1 = 102;
		char m1char = (char)m1;
		System.out.println(m1char);
		// all char is int
		// but all int is not char
		
		char aaChar = '\u0C05';
		System.out.println(aaChar);
		
		
		
	}
}
