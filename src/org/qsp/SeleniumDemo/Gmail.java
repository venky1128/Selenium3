package org.qsp.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/login");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
	}

}
