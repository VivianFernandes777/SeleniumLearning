package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindowhandle9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/*
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver(co); // window handle driver.get("https://www.guru99.com/");
		 * driver.manage().window().maximize(); Thread.sleep(3000); String windowhandle
		 * = driver.getWindowHandle(); System.out.println(windowhandle); // window
		 * handles driver.navigate().to("https://www.comearth.world/");
		 * Thread.sleep(10000); driver.findElement(By.
		 * xpath("(//a[normalize-space()='Enter The Metaverse'])[1]")).click();
		 * Set<String> windowhandles = driver.getWindowHandles();
		 * System.out.println(windowhandles); Thread.sleep(5000);
		 * driver.switchTo().window(windowhandle); System.out.println("switching done");
		*/

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.comearth.world/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='Login/ Signup'])[1]")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> iterator = windows.iterator();
		String parentwindow = iterator.next();
		String Childwindow = iterator.next();
		driver.switchTo().window(Childwindow);
		System.out.println("switch to child window succesful");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vivian.fernandes777@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12344556");
		driver.findElement(By.xpath("//button[@class='sc-gsnTZi cnexox form-btn']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);
		System.out.println("swtich to parent window");
		driver.switchTo().window(Childwindow);
		System.out.println("switch to child widows again");
		driver.switchTo().window(parentwindow);
		System.out.println("again parent window");
	}

}
