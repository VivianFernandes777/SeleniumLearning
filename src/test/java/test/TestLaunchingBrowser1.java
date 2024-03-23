package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLaunchingBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// ChromeOptions co = new ChromeOptions();
		// co.addArguments("--remote-allow-origins=*");
		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver(co);
		// geturl
		// 1) firefox lunch
		// through maven
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\Vivia\\Downloads\\selenium\\browser\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("The Title is" + driver.getTitle());
		driver.close();

		// 2) chromelunch
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver(co);
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Vivia\\Downloads\\selenium\\browser\\chromedriver.exe");
		// WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.saucedemo.com/");
		driver1.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("The Title is " + driver1.getTitle());
		driver.close();

		// 3) edgelunch
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver2 = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Vivia\\Downloads\\selenium\\browser\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.saucedemo.com/");
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("The Title is" + driver2.getTitle());
		driver.close();

	}

}
