package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestResize13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.way2automation.com/way2auto_jquery/resizable.php#load_box");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@src='resizable/default.html']"));
		driver.switchTo().frame(Frame1);
		WebElement  Resizeable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions Action1 = new Actions(driver);
		Action1.dragAndDropBy(Resizeable, 300, 100);
		Action1.perform();
		Thread.sleep(3000);
	}

}
