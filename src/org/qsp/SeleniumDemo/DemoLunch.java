package org.qsp.SeleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.get("https://www.facebook.com/");
		//String title =driver.getTitle();
		//System.out.println(title);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		//driver.quit();
	}

} 
