package maybatch;

public class MethodChaining {
	public static void main(String[] args) {

		String st = "abcd12SABSHJ    ";
		
		// literal 
		// Obejct
		
		String st1 = new String("asdfadfad");
		
		
		// uppercase 
		//	st = st.toUpperCase();
		//	// A  replace Z
		//	st = st.replace("A", "Z");
		//	// trim()
		//	st = st.trim();
		//	// lowercase
		//	st = st.toLowerCase();

		//	st = st.toUpperCase().replace("A", "Z").trim().toLowerCase();
		//	
		//	System.out.println(st);

		M m = new M();
		System.out.println(m);
		m.m1().m2();

		// 	paper , 5 people 
	}
}

class M{

	public M m1() {
		System.out.println("i am in m1 method");
		System.out.println(this);
		return this;
	}

	public M m2() {
		System.out.println("i am in m2 method");
		System.out.println(this);
		return this;
	}
}

