package inheri;

public class InterfaceDemo {
public static void main(String[] args) {
	
}
}

//class P1{
//	public void m1();
//}
//class P2 extends P1{
//	public void m1();
//}
//class P3 extends P2{
//	
//}

// exact like class . all the methods inside interface is abstract .

interface Cricket{
	
	String sportname = "cricket";
	public void m1();
	public void batter();
	public void bowler();
	
}

interface Football extends Cricket{
	public void m1();
	public void goalkeeper();
}


class SportsMan implements Football{
	public void batter() {
	}
	
	public void bowler() {
	}
	
	public void m1() {
	}
	
	public void goalkeeper() {
	}
}
