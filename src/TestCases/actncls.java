package TestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actncls {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\selenium\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement frameElement=driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frameElement);
		
		WebElement fromElement=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/h5")); 
		WebElement toElement=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		Actions action=new Actions(driver);
		action.dragAndDrop(fromElement, toElement)
		.clickAndHold(fromElement)
		.moveToElement(toElement)
		.release(toElement)
		.build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement trashElement=driver.findElement(By.xpath("//*[@id=\"trash\"]/ul/li/img"));
		WebElement backElement=driver.findElement(By.xpath("//*[@id=\"gallery\"]"));
		Actions action1=new Actions(driver);
		action1.dragAndDrop(trashElement, backElement).clickAndHold(trashElement) 
		.moveToElement(backElement).release(backElement).perform();
		
		Thread.sleep(10000);
//		driver.switchTo().defaultContent();
//		driver.findElement(By.linkText("Sortable")).click();
	}

}
