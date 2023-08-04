package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scrrenshot {
	public void takingScreenshotOfWebPage(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempfile =ts.getScreenshotAs(OutputType.FILE);
		String Timestamp=LocalDateTime.now().toString().replace(':', '-');
		File parmanentFile = new File("./Screenshots/"+Timestamp+"WebPage.png");
		FileHandler.copy (tempfile, parmanentFile);
		}
		public void takingScreenshotOfWebPage(WebDriver driver,WebElement element) throws IOException {
			
			File tempfile =element.getScreenshotAs(OutputType.FILE);
			String Timestamp=LocalDateTime.now().toString().replace(':', '-');
			File parmanentFile = new File("./Screenshots/"+Timestamp+"WebPage.png");
			FileHandler.copy (tempfile, parmanentFile);
		}
		public void waitTillElementVisible(WebDriver driver,WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));

}
}
