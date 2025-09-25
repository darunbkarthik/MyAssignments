package week5day1Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");	
		
		ChromeDriver driver = new  ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']/tbody/tr/td[2]/a/img)[1]")).click();

		Set<String> childWindow = driver.getWindowHandles();
		//convert set into list
		List<String> listWindow = new ArrayList<String>(childWindow);
		//navigate to childWindow
		driver.switchTo().window(listWindow.get(1)); // child window is always index 1, parent index is 0
		driver.getWindowHandle();
		
		driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a)[1]")).click();
		driver.switchTo().window(listWindow.get(0)); // child window is always index 1, parent index is 0
		driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']/tbody/tr/td[2]/a/img)[2]")).click();
		Set<String> childWindow1 = driver.getWindowHandles();
		List<String> listWindow1 = new ArrayList<String>(childWindow1);
		driver.switchTo().window(listWindow1.get(1)); // child window is always index 1, parent index is 0
		driver.getWindowHandle();
		
		driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[2]/tbody/tr/td/div/a)[1]")).click();
		driver.switchTo().window(listWindow.get(0)); // child window is always index 1, parent index is 0
		driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
