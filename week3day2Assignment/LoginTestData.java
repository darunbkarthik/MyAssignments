package week3day2Assignment;

public class LoginTestData extends TestData {
	
	public void enterUsername(String mailId)
	{
		System.out.println("Username:"+mailId);
	}
	public void enterPassword(String password)
	{
		System.out.println("Password:"+password);
	}
	

	public static void main(String[] args) {

		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.enterUsername("xyz@gmail.com");
		login.enterPassword("123qwe");
		login.navigateToHomePage();
		

	}


}
