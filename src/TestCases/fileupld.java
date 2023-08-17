package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupld {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\selenium\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://kitchen.applitools.com/ingredients/file-picker");
		
		//USING AUTOIT
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.xpath("//*[@id=\"photo-upload\"]")).sendKeys("C:\\Users\\samim\\Downloads\\Intimation.pdf");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).click();
		Runtime.getRuntime().exec("C:\\AutoIT Scripts\\intim.exe");
	}
	
	
}
