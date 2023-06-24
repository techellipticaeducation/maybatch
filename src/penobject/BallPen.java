package penobject;


class BallPen {
	Refill refillObject;
	Cap cap;
	PenBody body;
	

	
	
	public void writeContent(String content) {
		System.out.println("-- will be written in " + refillObject.color);
		System.out.println(content);
	}	
}




