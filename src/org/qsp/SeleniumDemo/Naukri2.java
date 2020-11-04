package org.qsp.SeleniumDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Naukri2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> wins = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(wins);
		 driver.switchTo().window(lst.get(1));
		 Thread.sleep(2000);
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
			
		}
	}

