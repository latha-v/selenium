package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.driverwaits;

public class page5 {
	WebDriver dr;
	driverwaits d;
	public page5(WebDriver dr)
	{
		this.dr=dr;
		
	}
	By carspeed = By.xpath("//*[@id='top-of-content']/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[2]/div");
	
	
	public  boolean page5Actions()
	{
		boolean b;
		d= new driverwaits(dr);
		WebElement e = d.waitforelement(carspeed, 40);
		 String speed = e.getText();
		 System.out.println(speed);
		 int sp=Integer.parseInt(speed);
		 
		 if(sp>500)
		 {
			 b=true;
		 }
		 else
		 {
			 b= false;
		 }
		 return b;
	}

}
