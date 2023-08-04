package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		
		WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"loginBtn\"]"));
		loginButton.click();
		Thread.sleep(7000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement usernameTextFeild=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		jse.executeScript("arguments[0].value='Raja';",usernameTextFeild);
		jse.executeScript("arguments[0].style.border='4px solid blue';",usernameTextFeild);
		
		
//		String Title = (String) jse.executeScript("Return Document.title;");
//		System.out.println(Title);
//		if(Title.equals("ShoppersStack | Login")) {
//			System.out.println("Same Page");
//		}
//		else {
//			System.out.println("Different Page");
//		}
//		
//		String Url = (String) jse.executeScript("Return Document.Url;");
//		System.out.println(Url);
//		if(Url.equals("https://shoppersstack.com/user-signin")) {
//			System.out.println("Same Url");
//		}
//		else {
//			System.out.println("Different Url");
//		}
//		
//		driver.close();
		
		
	}

}
