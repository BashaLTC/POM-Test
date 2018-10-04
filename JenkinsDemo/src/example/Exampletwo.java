package example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exampletwo {

	@Test
	public void demo() throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in");
		
		driver.findElementByXPath("//span[contains(text(),'AGENT LOGIN')]").click();
			
		Thread.sleep(3000);
		
		driver.findElementById("usernameId").sendKeys("ArunKumarRJ");
	
		driver.findElementById("usernameId").clear();
		
		driver.findElementByLinkText("Sign up").click();
		
		Thread.sleep(5000);
		
		driver.close();
	}
	
	
	
	
	
}
