package test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNavigation3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.saucedemo.com/");
		// manage
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// GetCurrenturl
		String currenturl1 = driver.getCurrentUrl();
		System.out.println(currenturl1);
		// gettitle
		String title = driver.getTitle();
		System.out.println(title);
		// navigateto
		driver.navigate().to("https://www.guru99.com/");
		Thread.sleep(3000);
		String currenturl2 = driver.getCurrentUrl();
		System.out.println(currenturl2);
		String title2 = driver.getTitle();
		System.out.println(title2);
		// referesh
		driver.navigate().refresh();
		Thread.sleep(6000);
		// navigate to back
		driver.navigate().back();
		Thread.sleep(6000);
		// forward
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");
		driver.quit();
		System.out.println("navigation part done");
	}

}
