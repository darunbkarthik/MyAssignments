package week3day2Assignment;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("Click check button");
	}

	public static void main(String[] args) {

		CheckBoxButton c = new CheckBoxButton();
		c.click();
		c.setText("Kim");
		c.submit();
		c.clickCheckButton();
	}

}
