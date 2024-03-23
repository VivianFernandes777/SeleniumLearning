package test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDesiredCapability22 {

	private static final String True = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ChromeOptions co = new ChromeOptions();
		// co.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, True);
		

		// EdgeOptions eg = new EdgeOptions();
		// eg.merge(cap);
		// WebDriverManager.edgedriver().setup();
		// EdgeDriver driver = new EdgeDriver(eg);
		// FirefoxOptions fo = new FirefoxOptions();
		// fo.merge(cap);
		// WebDriverManager.firefoxdriver().setup();
		// FirefoxDriver driver = new FirefoxDriver(fo);
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.merge(cap);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

}
