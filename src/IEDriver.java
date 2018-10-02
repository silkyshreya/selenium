import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		Thread.sleep(1000);
		ie.close();

	}

}
