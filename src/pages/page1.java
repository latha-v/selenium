package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.driverwaits;

public class page1 {
WebDriver dr;
driverwaits d;
public page1(WebDriver dr)
{
	this.dr=dr;
	
}
By models = By.xpath("//*[@class='tw-cursor-pointer']//child::a");
public void page1Actions()
{
	d= new driverwaits(dr);
	
	WebElement e = d.elementtobeclickable(models, 20);
	e.click();
}

}
