package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabs10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.comearth.world/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Store all currently open tabs in tabs
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.findElement(By.xpath("(//a[normalize-space()='Login/ Signup'])[1]")).click();
		// Switch newly parent  Tab
		driver.switchTo().window(tabs.get(0));
		System.out.println("tab 1");
		// Perform some operation on Newly open tab
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vivian.fernandes777@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12344556");
		driver.findElement(By.xpath("//button[@class='sc-gsnTZi cnexox form-btn']")).click();
		Thread.sleep(3000);
		System.out.println("tab 2");
        // Close newly open tab after performing some operations.
		driver.close();
      
	
	}

}
