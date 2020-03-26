package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.driverwaits;

public class page2 {
	WebDriver dr;
	driverwaits d;
	public page2(WebDriver dr)
	{
		this.dr=dr;
		
	}
	By s7= By.xpath("//*[@class='tw-cursor-pointer tab-scroll-header-item tw-z-10 tab-bar-animation'][4]//child::a");
	
	public void page2Actions()
	{
		d= new driverwaits(dr);
		WebElement e= d.elementtobeclickable(s7, 40);
		e.click();
	}
}
