package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		List<WebElement> allWebElement = driver.findElements(By.xpath("//ul[@class='makeFlex font12']/li"));
		for(WebElement  ele:allWebElement)
		{
		String value=ele.getAttribute("class");
		System.out.println(value);
		}
		
	}

}
																																																																																																	