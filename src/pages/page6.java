package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.driverwaits;

public class page6 {
	WebDriver dr;
	driverwaits d;
	
	public page6(WebDriver dr)
	{
		this.dr= dr;
		
	}
	
	By carhp = By.xpath("//*[@id=\"top-of-content\"]/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[1]/div/table/tbody/tr[4]/td[2]/div");
	
	public boolean page6Actions()
	 {
		boolean b;
		d = new driverwaits(dr);
		WebElement e= d.waitforelement(carhp, 40);
		String hpower=e.getText();
		System.out.println(hpower);
		int l= hpower.length();
		hpower = hpower.substring(l-13, l-10);
		System.out.println(hpower);
		int hp=Integer.parseInt(hpower);
		if(hp>500)
		{
			b=true;
		}
		else
		{
			b=false;
		}
		 return b;
	 }

}
