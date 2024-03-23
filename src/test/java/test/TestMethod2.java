package test;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethod2 {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// getCURRENT url
		System.out.println(driver.getCurrentUrl());
		// getpagesourcecode
		System.out.println(driver.getPageSource());
		// title
		System.out.println("The title is " + driver.getTitle());
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("vivian");
		driver.findElement(By.xpath("//input[@id='user-name']")).clear();
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getAttribute("data-test"));
		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getCssValue("font-family"));
		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getSize());
		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getLocation());
		
		// close current page
		driver.close();
		// quit all tab
		driver.quit();
	}
}
