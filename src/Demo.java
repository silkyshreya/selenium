import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
	 System.out.println("Enter the browser:");
	 Scanner sc=new Scanner(System.in);
	 String browser=sc.nextLine();
	 
	 WebDriver driver=null;
	 if(browser.equals("ff"))
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	driver=new FirefoxDriver();
	}
	 
else
	if(browser.equals("gc"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	 Thread.sleep(2000);
	 driver.close();
	

	}

}
