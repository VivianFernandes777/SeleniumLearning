package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPrintLink18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.nftically.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> printLink = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " + printLink.size());

		for (int i = 0; i < printLink.size(); i++) {
			System.out.println(printLink.get(i).getText());
			System.out.println(printLink.get(i).getAttribute("href"));
			// System.out.println("links on the page are" +
			// printalllinks.get(i).getAttribute("href"));
		}
	}

}
