package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDragDrop12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.way2automation.com/way2auto_jquery/droppable.php#load_box");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@src='droppable/default.html']"));
		driver.switchTo().frame(Frame1);
		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement Drop = driver.findElement(By.id("droppable"));
		Actions Action1 = new Actions(driver);
		Action1.dragAndDrop(Drag, Drop);
		Action1.perform();
		Thread.sleep(3000);
		System.out.println("drag and drop functiom performed");
	}

}
