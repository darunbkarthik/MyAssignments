package week6day1Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class BaseClassDynamic {
	
	public ChromeDriver driver;//made it as global variable to access in all the methods in this class
	public String excelFileName;
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {


		String[][] data=CommonExcelIntegration.readData(excelFileName);// since ReadExcelIntegration class is static no need to create object and call, we can call directly
		return data;
	}
	
	@Parameters({"url", "username", "password"})
	@BeforeMethod
	public void preCondition(String url,String username, String password) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();

        // Step 2: Open menu and navigate
        Thread.sleep(3000); // Explicit waits (recommended: replace with WebDriverWait)
		driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		
		driver.close();
	}
	
	@AfterSuite
	public void stopReports() {
		System.out.println("Stopped the Reports");
	}

}
