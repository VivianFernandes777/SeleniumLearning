package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRadio6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.xpath("(//input[@name='browser'])[1]"));
		Actions Action1 = new Actions(driver);
		Action1.moveToElement(radio);
		Action1.perform();
		Thread.sleep(5000);
		radio.click();
		System.out.println("radion btn is clicked");
		WebElement Red2 = driver.findElement(By.xpath("(//input[@name='browser'])[2]"));
		Red2.click();
		Thread.sleep(3000);
		System.out.println(Red2.isSelected());
		System.out.println(Red2.isEnabled());
		System.out.println(Red2.isDisplayed());
		WebElement Red3 = driver.findElement(By.xpath("(//input[@name='browser'])[3]"));
		Red3.click();
		System.out.println(Red3.isSelected());
		System.out.println(Red2.isSelected());
		System.out.println(radio.isSelected());
	}

}
