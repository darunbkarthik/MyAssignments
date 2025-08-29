package week2day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHome {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Yoli");
		driver.findElement(By.name("lastname")).sendKeys("Truli");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("123qwe123qwe");
		
		WebElement dayDD = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel1 = new Select(dayDD);
		sel1.selectByIndex(14);
		
		WebElement monthDD = driver.findElement(By.xpath("//select[@id='month']"));
		Select sel2 = new Select(monthDD);
		sel2.selectByIndex(5);
		
		WebElement yearDD = driver.findElement(By.xpath("//select[@id='year']"));
		Select sel3 = new Select(yearDD);
		sel3.selectByIndex(25);
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		
		driver.close();
		
	}	
}
