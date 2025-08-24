package week2day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.name("firstNameLocal")).sendKeys("Lewis");
		driver.findElement(By.name("lastNameLocal")).sendKeys("Hamilton");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Ferrari");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Driver");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
