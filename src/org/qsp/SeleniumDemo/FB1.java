package org.qsp.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("venkat");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nalla");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='u_1_g']")).sendKeys("9739740558");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("venky123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[contains(.,'Male')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			Thread.sleep(2000);
		}
}
