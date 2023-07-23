package browserimplementation;

public interface Browser {
	public void openBrowser();
	public void click(String element);
	public void sendKeys(String element);
}

class Chrome implements Browser{
	String browserName = "chrome";
	public void openBrowser() {
		System.out.println(browserName + " ->  Open browser");
	}
	public void click(String element) {
		System.out.println(browserName + " -> " +element+ " click");
	}
	public void sendKeys(String element) {
		System.out.println(browserName + " -> " +element+ "sendKeys");
	}
}

class Firefox implements Browser{
	String browserName = "firefox";
	public void openBrowser() {
		System.out.println(browserName + " ->  Open browser");
	}
	public void click(String element) {
		System.out.println(browserName + " -> " +element+ " click");
	}
	public void sendKeys(String element) {
		System.out.println(browserName + " -> " +element+ "sendKeys");
	}
}

class Edge implements Browser{
	String browserName = "Edge";
	public void openBrowser() {
		System.out.println(browserName + " ->  Open browser");
	}
	public void click(String element) {
		System.out.println(browserName + " -> " +element+ " click");
	}
	public void sendKeys(String element) {
		System.out.println(browserName + " -> " +element+ "sendKeys");
	}
}

class TMBrowser implements Browser{
	String browserName = "TMBrowser";
	public void openBrowser() {
		System.out.println(browserName + " ->  Open browser");
	}
	public void click(String element) {
		System.out.println(browserName + " -> " +element+ " click");
	}
	public void sendKeys(String element) {
		System.out.println(browserName + " -> " +element+ "sendKeys");
	}
}
