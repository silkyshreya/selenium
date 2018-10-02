import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleWebpage
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sony/Desktop/sample3.html");
		
		//By using id
		driver.findElement(By.id("fp")).click();
		driver.navigate().back();
		
		//By using name
		driver.findElement(By.name("pass")).click();
		driver.navigate().back();
		
		//By using className
		driver.findElement(By.className("abc")).click();
		driver.navigate().back();
		
		//By using tagName
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		
		//By using LinkText
		driver.findElement(By.linkText("Forgot Password???")).click();
		driver.navigate().back();
		
		//By using partialLinkText
		driver.findElement(By.partialLinkText("Inbox")).click();
	}

}
