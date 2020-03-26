package Testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.page1;
import pages.page2;
import pages.page3;
import pages.page4;
import pages.page5;
import pages.page6;

import utility.driverwaits;
import utility.excelwrite;

public class chromed 
{
	WebDriver dr;
	driverwaits d;
	wrapper.Browser_launch l;
	page1 p1;
	page2 p2;
	page3 p3;
	page4 p4;
	page5 p5;
	page6 p6;
	excelwrite e;
	
  @Test
  public void speed() 
  {
	  e= new excelwrite();
	  
	 l =new wrapper.Browser_launch();
	dr= l.launch("chrome","https://www.bmw.in/en/");
	p1 = new page1(dr);
	p1.page1Actions();
	p2= new page2(dr);
	p2.page2Actions();
	p3= new page3(dr);
    p3.page3Actions();
	p4 = new page4(dr);
	p4.page4Actions();
	p5 = new page5(dr);
	
	boolean b= p5.page5Actions();
	System.out.println(b);
	String message = "doesnot meet my requirements ";
	SoftAssert sa= new SoftAssert();
	sa.assertTrue(b, message);
	sa.assertAll();
	e.write(message);
	 
  }
 /* @Test
  public void hp()
  {
	  p6=new page6(dr);
	boolean b1=	p6.page6Actions();
	String message = "doesnot meet my requirements ";
	Assert.assertTrue(b1, message);
  }*/
}
