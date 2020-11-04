package org.qsp.SeleniumDemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> wins = driver.getWindowHandles();
       for (String win : wins) {
    	   System.out.println(win);
    	   driver.switchTo().window(win);
    	   driver.close();
       }
	}

}
