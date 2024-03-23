package test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().getPageLoadTimeout();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		String window = driver.getWindowHandle();
		System.out.println("The windows handles are id " + window);
        driver.findElement(By.xpath("//button[@id='newTabsBtn']")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		System.out.println(windows.size());
		Iterator<String> itr = windows.iterator();
		String tab1 = itr.next();
		System.out.println("your tab windows handle is id " +tab1);
		String tab3 = itr.next();
		System.out.println("your tab windows handle is id " +tab3);
		String tab2 = itr.next();
		System.out.println("your tab windows handle is id " +tab2);
		
		driver.switchTo().window(tab2);
		System.out.println(driver.getTitle());
		/*System.out.println("move to tab3 ");
		driver.switchTo().window(tab3);
	    driver.findElement(By.xpath("//button[@id='alertBox']")).click();
	    String  alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
		System.out.println("operation done on tab 3 ");
	
		System.out.println("move to  tab 1 ");
		driver.switchTo().window(tab1);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("viviaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaan");
	    System.out.println("operation done a tab 1 ");
	    
	    System.out.println("move to tab2 ");
        driver.switchTo().window(tab2);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vivian");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Fernandes");
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		System.out.println("operation done on tab 2 ");
		
		
		
		*/System.out.println("Tabs switching done");
	}
}
