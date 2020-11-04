package org.qsp.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.navigate().back();
		driver.get("https://www.Google.com/");
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.close();
		
		
		//driver.close();

	}

}
