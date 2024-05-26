package testNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class VerifyTitle {
	@Test

	public void titleTest()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
		driver.close();
		
		
	}
}
