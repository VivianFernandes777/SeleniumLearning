package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyboard15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Key = driver.findElement(By.xpath("(//div[@role='presentation'])[1]"));
		Actions Act = new Actions(driver);
		Act.keyDown(Key, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(3000);
		WebElement Key1 = driver.findElement(By.xpath("(//div[@class='CodeMirror-scroll'])[2]"));
		Act.keyDown(Key1, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		System.out.println("text is copied");
	}
	
}
