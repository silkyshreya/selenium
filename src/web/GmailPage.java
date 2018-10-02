package web;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailPage 
{
		static
		{
		 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}
	
		public static void main(String[]args) throws InterruptedException
		{
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter username:");
		 String email=sc.nextLine();
		 
		 System.out.println("Enter password:");
		 String pass=sc.nextLine();

		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 driver.findElement(By.id("identifierId")).sendKeys(email);
		 driver.findElement(By.xpath("//span[.='Next']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.name("password")).sendKeys(pass);

		 driver.findElement(By.xpath("//span[.='Next']")).click();
		 

	}
	}

