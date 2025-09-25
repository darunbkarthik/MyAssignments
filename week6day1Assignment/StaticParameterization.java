package week6day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StaticParameterization {
	
	public ChromeDriver driver;

	
	@Test
    @Parameters({"url", "username", "password"})
	public void createLegalEntity(String url, String username, String password) throws InterruptedException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		driver = new ChromeDriver(options);
		// Step 1: Login
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

        // Step 3: Open Legal Entities
        Thread.sleep(3000);
       WebElement mH = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
       Actions act = new Actions(driver);
	   act.moveToElement(mH).click().perform();
       Thread.sleep(2000);

        // Step 4: Click Dropdown in tab and then New Legal Entity
       // driver.findElement(By.xpath("//a[@title='Legal Entities']/following::button[1]")).click();
        driver.findElement(By.xpath("//div[@title='New']")).click();

        Thread.sleep(2000);

        // Step 5: Enter company details
        //driver.findElement(By.xpath("(//input[@name='Name'])")).sendKeys("Qeagle");
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
        driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
//        WebElement mH1 = driver.findElement(By.xpath("//input[@name='postalCode']"));
//        act.scrollToElement(mH1).perform();
        driver.findElement(By.xpath("(//span[@class='slds-truncate'])[3]")).click();
        driver.findElement(By.xpath("//span[@title='Active']")).click();

        // Step 6: Save
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

        // Step 7: Verify Alert
        WebElement alert = driver.findElement(By.xpath("//div[text()='Complete this field.']"));
        if (alert.isDisplayed()) {
            System.out.println("Alert message displayed: Complete this field");
        } else {
            System.out.println("Alert message NOT displayed!");
        }

      
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
