package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driverwaits
{
	WebDriver dr= null;
	WebElement e= null;
	public driverwaits(WebDriver dr)
	{
		this.dr=dr;
		
	}
	public WebElement  waitforelement(By locator,int time)
	{
		try
		{
		WebDriverWait w= new WebDriverWait(dr,time);
		e=w.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		catch(WebDriverException e1)
		{
			System.out.println("element not found");
		}
		return e;
	}
	public WebElement  elementtobeclickable(By locator,int time)
	{
		try
		{
		WebDriverWait w= new WebDriverWait(dr,time);
		e=w.until(ExpectedConditions.elementToBeClickable(locator));
		}
		catch(WebDriverException e1)
		{
			System.out.println("element not found");
		}
		return e;
	}
	
}
