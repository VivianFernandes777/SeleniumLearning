package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlert16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);

		driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
		driver.manage().window().maximize();
        Thread.sleep(3000);
		WebElement Frame1 = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Frame1);
		Thread.sleep(3000);
		WebElement Btn = driver.findElement(By.xpath("(//button[normalize-space()='Click the button to display an alert box:'])[1]"));
		Btn.click();
		String Alert1 = driver.switchTo().alert().getText();
		System.out.println(Alert1);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		// Second part
		WebElement Btn2 = driver.findElement(By.xpath("(//a[normalize-space()='Input Alert'])[1]"));
		Btn2.click();
		WebElement Frame2 = driver.findElement(By.xpath("//iframe[@src='alert/input-alert.html']"));
		driver.switchTo().frame(Frame2);
		Thread.sleep(5000);
		WebElement Btn4 = driver.findElement(By.xpath("(//button[normalize-space()='Click the button to demonstrate the Input box.'])[1]"));
		Btn4.click();
		String Alert2 = driver.switchTo().alert().getText();
		System.out.println(Alert2);
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Vivian Fernandes");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("the text is " + text);
//
		// Alert Alert5 = driver.switchTo().alert();
		// Alert5.getText();
		// System.out.println(Alert5);
		// Thread.sleep(3000);
		// Alert5.sendKeys("Vivian Fernandes");
		// Thread.sleep(3000);
		// Alert5.accept();
	}

}
