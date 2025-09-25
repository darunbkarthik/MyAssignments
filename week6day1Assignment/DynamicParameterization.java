package week6day1Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcases.CommonExcelIntegration;

public class DynamicParameterization extends BaseClassDynamic{
	
	@BeforeTest
	public void setValues() {
		excelFileName="dynamicParameterisation";
	}

	@Test(dataProvider="fetchData")
	public void runDynamicParameterization(String entityName) throws InterruptedException {
		
		Thread.sleep(3000);
	       WebElement mH = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	       Actions act = new Actions(driver);
		   act.moveToElement(mH).click().perform();
		   
	       Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@title='New']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//input[@name='Name'])")).sendKeys(entityName);
	        String name = entityName;
	        System.out.println(name);
	        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	        
	        Thread.sleep(3000);
	        String alert = driver.findElement(By.xpath("(//slot[@name='outputField']/lightning-formatted-text)[1]")).getText();
	        if (alert.equals(name)) {
	            System.out.println("Entity name Match");
	        } else {
	            System.out.println("Entity name NOT matched");
	        }


}
}
