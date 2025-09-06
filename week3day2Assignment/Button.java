package week3day2Assignment;

public class Button extends WebElement{
	
	public void submit() {
		System.out.println("Submitted");
	}

	public static void main(String[] args) {

		Button b= new Button();
		b.click();
		b.setText("Don");
		b.submit();
	}

}
