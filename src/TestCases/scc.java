 package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scc {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot)driver;
		driver.get("https://www.facebook.com/login/");
		WebElement PasswordButton = driver.findElement (By.id("loginbutton"));
		String presentTime = LocalDateTime.now().toString().replace(':', '-');
		System.out.println(presentTime); 
		
		
		File tempFile=PasswordButton.getScreenshotAs(OutputType.FILE);
		File targetfile=new File("./Login.png");
	org.openqa.selenium.io.FileHandler.copy(tempFile, targetfile);
		driver.close(); 
	}

}
