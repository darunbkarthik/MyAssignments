package week3day2Assignment;

public class RadioButton extends Button{
	
	public void selectRadioButton() {
		System.out.println("Select Radio Button");
	}

	public static void main(String[] args) {

		RadioButton r = new RadioButton();
		r.click();
		r.setText("Tim");
		r.selectRadioButton();
	}

}
