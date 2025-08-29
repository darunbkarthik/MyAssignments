package week2day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_withSelectClass {

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
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("DK1234");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement industryDD = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select select = new Select(industryDD);
		select.selectByIndex(4);
		
		WebElement ownershipDD = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select Sel1 = new Select(ownershipDD);
		Sel1.selectByVisibleText("S-Corporation");
		
		WebElement sourceDD = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sel2 = new Select(sourceDD);
		sel2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaignDD = driver.findElement(By.id("marketingCampaignId"));
		Select sel3 = new Select(marketingCampaignDD);
		sel3.selectByIndex(7);
		
		WebElement stateDD = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select sel4 = new Select(stateDD);
		sel4.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(accountName);
		
		driver.close();
		
		
	}

}
