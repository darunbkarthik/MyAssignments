package week5day1Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Markets']")).click();
		driver.findElement(By.xpath("//span[text()='Crypto']")).click();
		
		Thread.sleep(5000);
		String row = driver.findElement(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr[1]/td[2]")).getText();
		System.out.println(row);
		
		Thread.sleep(5000);
		String column = driver.findElement(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr[1]/td[1]")).getText();
		System.out.println(column);
		
		
		List<WebElement> allData = driver.findElements(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr/td[2]"));
		for (WebElement rowIter1 : allData) {
			System.out.println(rowIter1.getText());
		}
		
		driver.close();
	}

}
