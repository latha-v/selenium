package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.driverwaits;

public class page3 {
	WebDriver dr;
	driverwaits d;
	public page3(WebDriver dr)
	{
		this.dr=dr;
		
	}
	By car = By.xpath("//*[@class='lg:tw-w-1/4 sm:tw-w-1/2 tw-w-full tw-relative']");
	
	public void page3Actions()
	{
		d= new driverwaits(dr);
		WebElement e= d.elementtobeclickable(car, 20);
		Actions a= new Actions(dr);
		a.moveToElement(e).build().perform();;
		WebElement e1 = d.elementtobeclickable(car, 20);
		e1.click();
		
	}

}
