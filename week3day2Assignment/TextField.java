package week3day2Assignment;

public class TextField extends WebElement{
	
	public void getText() {
		
		System.out.println("Adam");
	}

	public static void main(String[] args) {

		TextField t = new TextField();
		t.click();
		t.setText("Jim");
		t.getText();
	}

}
