package org.qsp.SeleniumDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rings",Keys.ENTER);
		//driver.findElement(By.xpath("//nav/ul/li/a[contains(.,'Rings')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block' and @alt ='The Irvin Ring']")).click();
        Thread.sleep(2000);      
        Set <String> tabs=driver.getWindowHandles();
        for (String tab: tabs) {
        driver.switchTo().window(tab);
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='buy-now']")).click();
        Thread.sleep(2000);
        //System.out.print(driver.findElement(By.xpath("//div[text()='* This field is required']")).getText());
        driver.findElement(By.xpath("//div[text()='* This field is required']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@data-key='07']")).click();
        driver.findElement(By.xpath("//input[@id='buy-now']")).click();
        driver.findElement(By.xpath("//a[@title='Place Order']")).click();
        Thread.sleep(2000);
        Set <String> tab1=driver.getWindowHandles();
        for (String wins: tab1) {
        System.out.println(driver.switchTo().window(wins).getTitle());
        }
            
        }    	
        	
	}

