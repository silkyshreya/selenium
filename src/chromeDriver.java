import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		Thread.sleep(1000);
		c.close();
	}

}
