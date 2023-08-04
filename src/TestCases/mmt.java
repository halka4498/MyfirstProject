package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmt {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./Chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		driver.findElement(By.xpath("//p[text()='2']")).click();
		
		
		


	}

}
