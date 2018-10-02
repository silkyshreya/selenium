package web;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecifictab 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		
		Set<String> allTab = driver.getWindowHandles();
		
		for(String tab:allTab)
		{
		 driver.switchTo().window(tab);
		 
		 String aTitle=driver.getTitle();
		 if(aTitle.equals("actiTIME - Time Tracking & Scope Management Software"))
		 {
		  driver.close();
		  break;
		 }
		}
	}

}
