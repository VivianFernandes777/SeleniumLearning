package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFindElemnts4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		  ChromeDriver(co); // geturl
		  driver.get("https://way2automation.com/way2auto_jquery/");
		 driver.manage().window().maximize(); Thread.sleep(3000); List<WebElement>
		  country = driver.findElements(By.tagName("option"));
		 System.out.println("Total country are " + country.size());
		  
		  for (int i = 0; i < country.size(); i++) {
		  System.out.println(country.get(i).getText());
		 
		 }
	

		/*ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000); // find element
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		// findelements
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		System.out.println(webelements.size());
		for (int i = 0; i < webelements.size(); i++) {
			System.out.println(webelements.get(i).getText());

		}
        */
	}

}