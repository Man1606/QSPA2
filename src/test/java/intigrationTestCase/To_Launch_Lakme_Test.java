package intigrationTestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class To_Launch_Lakme_Test {

	@Test
	public void cadbury() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}