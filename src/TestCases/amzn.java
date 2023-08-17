package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("scrollBy (0,2000)");
		driver.manage().window().maximize();
		

	}

}
