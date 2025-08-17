package Week1day2Assignment;

public class Browser {
	
	String launchBrowser(String browserName){
		return browserName;
	}
	String loadUrl(String urlMessage){
		return urlMessage;
	}

	public static void main(String[] args) {

		Browser obj=new Browser();
		System.out.println(obj.launchBrowser("Chrome"));
		System.out.println(obj.loadUrl("Url loaded successfully"));
	}

}
