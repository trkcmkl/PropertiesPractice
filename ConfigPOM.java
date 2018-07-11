package july10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigPOM {
	public ConfigPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="passwd")
	public WebElement password;
	
	@FindBy(id="SubmitLogin")
	public WebElement submitlogin;
	
}
