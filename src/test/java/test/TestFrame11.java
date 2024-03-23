package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrame11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);

		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='Iframe with in an Iframe'])[1]")).click();
		WebElement Frame2 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(Frame2);
		System.out.println("move to first frame");
		WebElement Frame1 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(Frame1);
		System.out.println("move to second frame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vivian");
		System.out.println("enter in text box");
		driver.switchTo().parentFrame();
		System.out.println("move to parent frame");
	}

}
