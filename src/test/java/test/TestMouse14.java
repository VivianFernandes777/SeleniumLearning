package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouse14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.nftically.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Mouse Hover Action in Selenium:
		WebElement Solution = driver.findElement(By.xpath("//li[@class='nav-item dropdown solution-dropdown']//a[@id='navbarDropdown']"));
		Actions Action1 = new Actions(driver);
		Action1.moveToElement(Solution);
		Action1.perform();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Enterprise']"));
		element.click();
		driver.navigate().back();
		Thread.sleep(5000);
		// Mouse Hover and Click on WebElement:
		WebElement elementToHover = driver.findElement(By.xpath("(//a[normalize-space()='Learn'])[1]"));
		WebElement elementToClick = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/div[1]/li[3]/a[1] "));
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
		driver.navigate().back();
		// Right click on WebElement using Action Class contextClick Method:
		WebElement tab = driver.findElement(By.xpath("//button[@id='pills-home-tab']"));
		Actions Action2 = new Actions(driver);
		Action2.contextClick(tab).build().perform();
		System.out.println("right clicked");
		// Double click on WebElement:
        WebElement Tab3 = driver.findElement(By.xpath("//button[@id='pills-contact-tab']"));
        Actions Action3 = new Actions(driver);
		Action3.doubleClick(Tab3).perform();
		System.out.println("double clicked");
	}

}
