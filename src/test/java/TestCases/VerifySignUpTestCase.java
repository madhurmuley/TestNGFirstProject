package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObject;
import Resources.BaseClass;

public class VerifySignUpTestCase extends BaseClass {
	
	@Test
	public void SignUp() throws IOException, InterruptedException {
	
		 
		LoginPageObjects lpo= new LoginPageObjects(driver);
		lpo.ClickOnTryforFree().click();
		
		Thread.sleep(10000);
		
		SignUpPageObject spo= new SignUpPageObject(driver);
		spo.EnterFirstname().sendKeys("Jhonny");
		spo.EnterLastname().sendKeys("Depp");
		spo.EnterWorkEmail().sendKeys("m.madhur444@gmail.com");
		Select s1=new Select(spo.SelectJobTitle());
		s1.selectByIndex(9);
		spo.EnterCompany().sendKeys("Pune Metro");
		Select s2=new Select(spo.SelectEmployees());
		s2.selectByIndex(1);
		spo.EnterPhone().sendKeys("8329843840");
		Select s3=new Select(spo.SelectCountry());
		s3.selectByIndex(1);
		
	}
}
