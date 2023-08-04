package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlpKrt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"nav-link-amazonprime\"]/span[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(link);
		action.build().perform();
		
		
	}

}
