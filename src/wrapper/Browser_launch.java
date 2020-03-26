package wrapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_launch {
	WebDriver dr;
	public WebDriver launch(String browser, String url)
	{
		switch (browser)
		{
		case "chrome" :
		{
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			dr= new ChromeDriver();
			break;
		}
		case "firefox" :
		{
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			dr= new FirefoxDriver();
			break;
		}
		}

		dr.manage().window().maximize();
		dr.get(url);
		return dr;
	}

}
