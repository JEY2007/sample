import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gurulogin {
	
	
public static WebDriver driver;
@FindBy(name="uid")
WebElement name;
@FindBy(name="password")
WebElement pw;
@FindBy(name="btnLogin")
WebElement login;
public Gurulogin(WebDriver driver)
{
	this.driver=driver;

}
public void login(String un, String pw1)
{
name.sendKeys(un);
pw.sendKeys(pw1);
login.click();
}
}