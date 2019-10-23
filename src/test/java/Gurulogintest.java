import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class Gurulogintest {
	
	
@Test(priority=0)
public void login2()
{
System.setProperty("webdriver.chrome.driver", "/Users/smohanathan/Downloads/chromedriver 2");
WebDriver driver =new ChromeDriver();
 driver.get("http://demo.guru99.com/v4/");
Gurulogin l=PageFactory.initElements(driver, Gurulogin.class);
l.login("RAmya","suba");

}

}