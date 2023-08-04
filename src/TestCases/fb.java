package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement loginButton = driver.findElement(By.id("loginbutton")) ;
		String tagNameofButton=loginButton.getTagName();
		System.out.println (tagNameofButton);
		String valueOfnameAttri = loginButton.getAttribute("name") ;
		System.out.println (valueOfnameAttri);
		String textofButton = loginButton.getText();
		System.out.println(textofButton);
		String valueOfCssPropertyWidth =loginButton.getCssValue("padding");
		System.out.println(valueOfCssPropertyWidth);
		String valueOfCssPropertyFont =loginButton.getCssValue("font-size");
		System.out.println(valueOfCssPropertyFont);
		Point location = loginButton.getLocation();
		int xvalue = location.getX();
		System.out.print("The X axis value is: "+ xvalue);
		
		int yvalue= location.getY();
		System.out.print("The Y axis value is: "+ yvalue);
		
		org.openqa.selenium.Dimension SizeloginButton = loginButton.getSize();
		int widthOfButton = SizeloginButton.getWidth();
		System.out.println("the width of Login button is:"+widthOfButton);
		int heigthOfButton = SizeloginButton.getHeight();
		System.out.println("the heigth of button is:"+heigthOfButton);
		Rectangle rect = loginButton.getRect();
		int xvaluel=rect.getX();
		System.out.println("the x axis value of button, from rect is:"+xvaluel);
		int yvaluel=rect.getY();
		System.out.println("the y axis value of button, from rect is:"+yvaluel);
		int widthOfButton1=rect.getWidth();
		System.out.println("the x axis value of button, from rect is:"+widthOfButton1);
		int heightOfButton1=rect.getHeight();
		System.out.println("the x axis value of button, from rect is:"+heightOfButton1);
		System.out.println();
		boolean displayed= loginButton.isDisplayed();
		if(displayed==true) {
			System.out.println("Yes");}
		else
		{System.out.println("No");}
		boolean Enabled= loginButton.isEnabled();
		if(Enabled==true) {
			System.out.println("Yupp");}
		else
		{System.out.println("Nope");}
			driver.quit();

	}

}
