package TestCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jspopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\selenium\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		FOR ALERT BOX
		WebElement loginButton=driver.findElement(By.id("alertBox"));
		loginButton.click();
		Alert alt =driver.switchTo().alert();
		alt.accept();
//		alt.dismiss();
		
//		FOR CONFIRMTION BOX
		WebElement loginButton1=driver.findElement(By.id("confirmBox"));
		loginButton1.click();
		Alert alt1 =driver.switchTo().alert();
		System.out.println(alt.getText());
		alt1.accept();
//		alt1.dismiss();
		
//		FOR PROMPT BOX
		WebElement loginButton2=driver.findElement(By.id("promptBox"));
		loginButton2.click();
		Alert alt2 =driver.switchTo().alert();
		System.out.println(alt.getText());
		alt2.accept();
//		alt2.dismiss();
		
		
	}

}
