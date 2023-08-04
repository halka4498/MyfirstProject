package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbqq {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("C:/Users/samim/Downloads/MultipleWindow%20(1).html");
		String currentWindowId=driver.getWindowHandle();
		System.out.println("current window Id before clicking-"+currentWindowId);
		
		System.out.println("All window id before clicking");
		Set<String> AllWIndowIds = driver. getWindowHandles ();
		for(String start:AllWIndowIds) {
		System.out.println(start);
		
		WebElement FoodButton = driver.findElement (By.xpath("//input[@value='Open Food Sites']"));
		FoodButton.click();
		Thread.sleep(1500);
		//Time given to load all windows
		String CurrentWindowIdAfterclick=driver.getWindowHandle();
		System.out.println("current window id after click"+CurrentWindowIdAfterclick);
		System.out.println("All window id after clicking");
		Set<String> allwindowIdsAfterclick = driver.getWindowHandles () ;
		
		for(String start1: allwindowIdsAfterclick) {
		System.out.println(start1);
		}
	}
	}
	
	
	}
	
//html/body/form/input