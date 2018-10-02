package web;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class FacebookPage 
{
	
	static
	{
	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[]args)
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter username:");
	 String un=sc.nextLine();
	 
	 System.out.println("Enter password:");
	 String pw=sc.nextLine();

	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.id("email")).sendKeys(un);
	 driver.findElement(By.name("pass")).sendKeys(pw);
	 driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	}

