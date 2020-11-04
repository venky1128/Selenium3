package org.qsp.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBCreate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("venky");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Nalla");
		driver.findElement(By.name("reg_email__")).sendKeys("v@gamil.con");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
	    driver.findElement(By.name("websubmit")).click();
	    
	}

}
