import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("http://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
