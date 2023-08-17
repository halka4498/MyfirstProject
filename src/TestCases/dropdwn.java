package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwn {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\selenium\\chromedriver_win32\\Chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select ref = new Select (dayDropDown);
		ref.selectByValue("9");
		ref.selectByValue("12");
		if(ref.isMultiple()==true) {
			System.out.println("Single");
		}
		else {
			System.out.println("Multiple");
		}
		List<WebElement> listOp = ref.getOptions();
		String allOptions="All Options are-"+listOp.size();
		System.out.println("allOptions");
		
		for(WebElement Eachoptions:listOp) {
			System.out.println(Eachoptions.getText());
			
		}
		List<WebElement> allSelected = ref.getAllSelectedOptions();
		for(WebElement each:allSelected) {
			if(each.getText().equals("9")) {
				System.out.println("Selected Same");
			}
			else {
				System.out.println("Selected Different");
			}
			System.out.println("Text is Selected"+each.getText());
			
			
			
		}
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select ref1 = new Select(monthDropDown);
		ref1.selectByVisibleText("Feb");
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select ref2 = new Select(yearDropDown);
		ref2.selectByValue("1997");
		}

}
