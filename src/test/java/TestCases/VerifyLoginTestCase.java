package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;

public class VerifyLoginTestCase extends BaseClass {

	@Test
	public void login() throws IOException, InterruptedException {
		
		LoginPageObjects lpo= new LoginPageObjects(driver);
		lpo.EnterUsername().sendKeys("Rocky");
		lpo.EnterPassword().sendKeys("123");
		lpo.ClickLogin().click();
				
	}
	
	
}
