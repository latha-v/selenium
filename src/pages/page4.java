package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.driverwaits;

public class page4 {
	WebDriver dr;
	driverwaits d;
	public page4(WebDriver dr)
	{
		this.dr=dr;
		
	}
	By  technical= By.xpath("//*[@id=\"content-navigation\"]/div/div/div/div/div/div[4]/nav/div/div[3]/a");
	
	public void page4Actions()
	{
		d= new driverwaits(dr);
	WebElement e = d.elementtobeclickable(technical, 20);
	e.click();
	}
}
