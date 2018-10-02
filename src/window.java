import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window 
{

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		Dimension d = new Dimension(500,500);
		d.setSize(d);
		
		Thread.sleep(1000);
		
		Point p = new Point();
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();

	}

}
