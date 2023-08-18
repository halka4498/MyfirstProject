package TestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlpKrt {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\selenium\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"nav-link-amazonprime\"]/span[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(link);
		action.build().perform();
	
		
	}

}
