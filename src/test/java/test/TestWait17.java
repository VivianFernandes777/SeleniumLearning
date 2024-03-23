package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWait17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.nftically.com/");
		driver.manage().window().maximize();
		// implicit wait
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
         WebElement Solution = driver.findElement(By.xpath("//li[@class='nav-item dropdown solution-dropdown']//a[@id='navbarDropdown']"));
		Actions Action1 = new Actions(driver);
		Action1.moveToElement(Solution);
		Action1.perform();
		// Explicitwiat
		// WebDriverWait wait = new WebDriverWait(driver,30);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-item'][normalize-space()='Enterprise']"))).click();
		// WebElement element
		// =driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Enterprise']"));
		// element.click();
		// Fluentwait
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(Exception.class);

	}

}
