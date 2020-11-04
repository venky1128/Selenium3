package org.qsp.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();  
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java",Keys.ENTER);
		//driver.findElement(By.className("gLFyf gsfi")).sendKeys("java",Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//span[contains(.,'Programming language')]")).getText());
	    Thread.sleep(2000);
	}

}
