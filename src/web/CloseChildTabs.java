package web;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildTabs 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Thread.sleep(5000);
		
		String pTab=driver.getWindowHandle();
		
		Set<String> allTab = driver.getWindowHandles();
		Thread.sleep(3000);
		
		for(String tab:allTab)
		{
		 driver.switchTo().window(tab);
		 
		 if(!pTab.equals(tab))
		 {
		   driver.close();
		   Thread.sleep(2000);
 
	}
		}
}
}
