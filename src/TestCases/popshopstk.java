package TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popshopstk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\selenium\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"loginBtn\"]"));
		loginButton.click();
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("oppopixel4@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Oppo@123");
		driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"men\"]"))));
		Actions action=new Actions(driver);
		action.moveByOffset(426,72).click().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"men\"]"))).perform();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/nav/ul/li[1]/div/aside/div[1]/ul[1]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/nav/ul/li[1]/div/aside/div[2]/ul/li[3]/a")).click();
		boolean displayed=driver.findElement(By.xpath("//a[text()='men sweatshirt']")).isDisplayed();
		if(displayed==true) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}}


