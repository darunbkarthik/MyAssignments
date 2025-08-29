package week2day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Edit_Lead {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");	
		
		ChromeDriver driver = new  ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("RD");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Nick");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Jones");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("NJ");
		driver.findElement(By.name("departmentName")).sendKeys("Software");
		driver.findElement(By.name("description")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		WebElement stateDD = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select sel4 = new Select(stateDD);
		sel4.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.partialLinkText("Edit")).click();
	    
	    WebElement description = driver.findElement(By.name("description"));
	    description.clear();
	    
	    driver.findElement(By.name("importantNote")).sendKeys("Selenium Learning");
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    
	    String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
