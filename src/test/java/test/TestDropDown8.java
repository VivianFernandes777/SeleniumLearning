package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDown8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement drop = driver.findElement(By.xpath("//select[@name='country']"));

		Select Select1 = new Select(drop);
		WebElement first = Select1.getFirstSelectedOption();
		System.out.println(first.getText());
		Select1.selectByIndex(13);
		Thread.sleep(2000);
		Select1.selectByValue("United States");
		Thread.sleep(2000);
		Select1.selectByVisibleText("Turkey");
		List<WebElement> allitem = Select1.getAllSelectedOptions();
		System.out.println(allitem.size());
        Select1.deselectByIndex(0);
 
        /*
        ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
    	// geturl
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		driver.close();
		*/
	}
}


