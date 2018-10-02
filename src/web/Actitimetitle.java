package web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Actitimetitle 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			//
		//WebDriver driver=new ChromeDriver();
		URL url=new  URL("http://255.255.0.0:4444/wb/hub/");
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		
		driver= new RemoteWebDriver(url, dc);
		
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			
			driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
			
			Set<String> allTab = driver.getWindowHandles();
			
			for(String tab:allTab)
			{
			 driver.switchTo().window(tab);
			 
			 String title=driver.getTitle();
			 System.out.println(title);
			 Thread.sleep(2000);
			}
}

}
