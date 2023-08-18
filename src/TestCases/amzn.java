package TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\selenium\\chromedriver_win32\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("scrollBy (0,2000)");
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
