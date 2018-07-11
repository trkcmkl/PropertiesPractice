package july10;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import allclasses.allclasses;

public class test extends allclasses {
	@Test
	public void testt() {

		ConfigPOM config = new ConfigPOM(driver);

		driver.get(ConfigLoader.getMyValue("URL"));
		driver.findElement(By.xpath("//a[@class='login']")).click();
		config.username.sendKeys(ConfigLoader.getMyValue("User"));
		config.password.sendKeys(ConfigLoader.getMyValue("Password"));
		config.submitlogin.click();
	}

}
