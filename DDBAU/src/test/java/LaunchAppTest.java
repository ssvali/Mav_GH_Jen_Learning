import java.util.concurrent.TimeUnit;







import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class LaunchAppTest

{

	@Test
	public  void LaunchDSMBTest()
	{
		WebDriver driver;
		driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://www.google.co.uk");
	}
}
