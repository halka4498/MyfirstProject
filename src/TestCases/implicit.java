package TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		// TODO Auto-generated method stub

	}

}
