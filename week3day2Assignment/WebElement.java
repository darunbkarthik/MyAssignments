package week3day2Assignment;

public class WebElement {

	public void click() {
		System.out.println("Click the text");
	}
	
	public void setText(String text) {
		System.out.println(text);
	}
	public static void main(String[] args) {

		WebElement w = new WebElement();
		w.click();
		w.setText("Roger");
	}

}
