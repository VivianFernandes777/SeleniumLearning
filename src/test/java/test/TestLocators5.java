package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLocators5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//id
		driver.findElement(By.id("user-name")).sendKeys("Vivian");
		//xpath
		driver.findElement(By.xpath("//input[@id='user-name']")).clear();
		//name
		driver.findElement(By.name("user-name")).sendKeys("victor");
		//classname
		driver.findElement(By.className("input_error form_input")).clear();
		//cssselector
		driver.findElement(By.cssSelector("#password")).sendKeys("123455");
		//xpath
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

}
