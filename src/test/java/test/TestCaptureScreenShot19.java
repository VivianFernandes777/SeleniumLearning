package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaptureScreenShot19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Date currentdate = new Date();
		System.out.println(currentdate);
		String Screenshotfilename = currentdate.toString().replace("", "-").replace("", "-");
		System.out.println(Screenshotfilename);
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//Screenshot//" +Screenshotfilename+ ".png"));
	}

}
