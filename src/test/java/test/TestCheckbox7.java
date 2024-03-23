package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckbox7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='red']")).click();
		driver.findElement(By.xpath("//input[@value='yellow']")).click();
		driver.findElement(By.xpath("//input[@value='blue']")).click();
		driver.findElement(By.xpath("//input[@value='orange']")).click();
		driver.findElement(By.xpath("//input[@value='purple']")).click();
		List<WebElement> color = driver.findElements(By.name("color"));
		System.out.println("Checkbox are " + color.size());

		for (int i = 0; i < color.size(); i++) {
			System.out.println(color.get(i).getText());
			
		}
	}
}
