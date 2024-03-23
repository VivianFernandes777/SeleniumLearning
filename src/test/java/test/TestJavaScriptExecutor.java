package test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://stqatools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("alert('hello world!');");
		// How to get innertext of the entire webpage in Selenium?
		String sText = js.executeScript("return document.documentElement.innerText;").toString();

		// How to navigate to different page using Javascript?
		js.executeScript("window.location = 'https://www.stqatools.com'");

		// How to enter value into textbox:
		js.executeScript("document.getElementById('email').value=sandeep@stqatools.com'");

		// How to click a button:
		js.executeScript("document.querySelector('#enterimg').click()");

		// How to refresh a window:
		js.executeScript("history.go(0)");

		// How to get the text of a particular web element:
		String text = js.executeScript("return document.getElementById('btn2').innerHTML").toString();
		System.out.println("WebElement Text is : " + text);

		// How to get the title of the WebPage:
		String title = js.executeScript("return document.title").toString();
		System.out.println("Page Title is : " + title);

		// How to scroll vertically for certain pixels:
		js.executeScript("window.scrollBy(0,500)");

		// How to scroll till the bottom of the web page:
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// How to scroll to a particular element:
		js.executeScript("document.querySelector('#countries').scrollIntoView()");

		// How to navigate back to page:
		js.executeScript("window.history.back()");

		// How to navigate to forward page:
		js.executeScript("window.history.forward()");
	}

}
