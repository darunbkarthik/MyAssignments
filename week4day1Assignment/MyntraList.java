package week4day1Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraList {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Laptop Bag')]")).click();
		
		Thread.sleep(3000);
		String count = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Count of the items: " +count);
		
		List<WebElement> brand = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		
		List<String> brandList=new ArrayList<String>();
		for (WebElement iter : brand) {
			String text = iter.getText();
			brandList.add(text);
		}
		
		System.out.println(brandList);
		
		List<WebElement> bagName = driver.findElements(By.xpath("//h4[@class='product-product']"));
		
		List<String> nameList = new ArrayList<>();
		for (WebElement iter1 : bagName) {
			String text1 = iter1.getText();
			nameList.add(text1);		
		}
		
		System.out.println(nameList);

		driver.close();
		
	}

}
