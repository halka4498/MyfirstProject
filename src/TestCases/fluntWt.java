  package TestCases;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class fluntWt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Thread.sleep(7000);
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofSeconds(1))
		.withMessage("loaded");
		
		WebElement LoginButtonelement = wait.until(new Function<WebDriver,WebElement >(){
			
			public WebElement apply(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"loginBtn\"]"));
		
		
			}
	});
		LoginButtonelement.click();
	}

}
