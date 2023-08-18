package TestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ctrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\selenium\\chromedriver_win32\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		WebElement loginButton=driver.findElement(By.linkText("Forgotten password?"));
//		Actions action=new Actions(driver);
//		action.keyDown(Keys.CONTROL).click(loginButton).keyUp(Keys.CONTROL)
//		action.contextClick(loginButton).perform();
		
		WebElement loginButton=driver.findElement(By.id("pass"));
		loginButton.sendKeys("Hello");
		Actions action=new Actions(driver);
		
		action.moveByOffset(1078,237).click().perform();
		loginButton.sendKeys("BYE");
		Thread.sleep(7000);
	}

}
