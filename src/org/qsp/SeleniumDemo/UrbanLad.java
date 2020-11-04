package org.qsp.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLad {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");	
		WebElement AuthClose = driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']"));
		Thread.sleep(10000);
		AuthClose.click();
		//driver.findElement(By.xpath("//input [@name='keywords']")).sendKeys("sofas",Keys.ENTER);
		WebElement Keyword = driver.findElement(By.xpath("//input [@name='keywords']"));
		Thread.sleep(2000);
		Keyword.sendKeys("Sofas",Keys.ENTER);
		Thread.sleep(2000);
		System.out.print(driver.findElement(By.xpath("//li/span[contains(.,'Living')]")).getText());
		
			
	}

}
