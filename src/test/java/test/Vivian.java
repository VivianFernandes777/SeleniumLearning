package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Vivian {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("The Title is " + driver.getTitle());
		//clicking on the register button 
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		//filling the registered details
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("vivian");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Fernandes");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("hadapsar");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("411013");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("7350969656");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("441");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("ggg123");
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("123456");
		driver.findElement(By.xpath(" //input[@id='repeatedPassword']")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //input[@value='Register']")).click();
		Thread.sleep(3000);
		//clicking on the open new account 
		driver.findElement(By.xpath("//a[normalize-space()='Open New Account']")).click();
		Thread.sleep(3000);
		//opening a saving account & selecting the drop down list 
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='type']"));
		Select Select1 = new Select(drop1);
		Thread.sleep(2000);
		Select1.selectByVisibleText("SAVINGS");
		WebElement drop2 = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		Select Select2 = new Select(drop2);
		Thread.sleep(2000);
		Select2.selectByIndex(0);
		System.out.println("Select the data from dropdown list");
		Thread.sleep(3000);
		//clicking on the open a new account button 
		driver.findElement(By.xpath(" //input[@value='Open New Account']")).click();
		Thread.sleep(3000);
		System.out.println("Congratulations, your account is now open.");
	    driver.close();
	}


}
