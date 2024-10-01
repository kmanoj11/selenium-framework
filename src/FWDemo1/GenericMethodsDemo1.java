package FWDemo1;


import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethodsDemo1
{
	WebDriver driver;

	public void openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriver driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriver driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriver driver = new EdgeDriver();
		}

	}

	public void enterURL(String url)
	{
		driver.get(url);
	}

	public void enterData(String locatorType,String locatorvalue,String data)
	{
		if(locatorType.equals("Xpath"))
		{
			driver.findElement(By.xpath(locatorvalue)).sendKeys(data);
		}
		else if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorvalue)).sendKeys(data);
		}
	}

	public void clickOnElement(String locatorType,String value)
	{

	}
}
