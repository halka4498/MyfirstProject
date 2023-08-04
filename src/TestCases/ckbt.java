package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ckbt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.cashify.in/buy-refurbished-mobile-phones/xiaomi");
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"filter_check_Xiaomi\"]")) ;
		checkbox.click();
		boolean IsSelected = checkbox.isSelected();
		if(IsSelected==true) {
			System.out.println("Yes");}
		else
		{System.out.println("No");}
		
		driver.close();
		
		
		

	}

}
