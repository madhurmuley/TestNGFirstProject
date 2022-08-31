package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

	public WebDriver driver;
	//driver.findElement(By.xpath("")).sendKeys();
	
	// we have achive encapsulation
	
	private By Firstname = By.xpath("//input[@name='UserFirstName']");
	private By Lastname = By.xpath("//input[@name='UserLastName']");
	private By WorkEmail = By.xpath("//input[@name='UserEmail']");
	private By JobTitle = By.xpath("//select[@name='UserTitle']");
	private By Company = By.xpath("//input[@name='CompanyName']");
	private By Employees = By.xpath("//select[@name='CompanyEmployees']");
	private By Phone = By.xpath("//input[@name='UserPhone']");
	private By Country = By.xpath("//select[@name='CompanyCountry']");

	
	public SignUpPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}
		//1
		public WebElement EnterFirstname() {
		
		return driver.findElement(Firstname);
	}
		//2
		public WebElement EnterLastname() {
			
			return driver.findElement(Lastname);
		}
		  //3
		public WebElement EnterWorkEmail() {
			
			return driver.findElement(WorkEmail);
		}
		
		//4
		public WebElement SelectJobTitle() {
			
			return driver.findElement(JobTitle);
		}
		//5
		public WebElement EnterCompany() {
			
			return driver.findElement(Company);
		}
		//6
		public WebElement SelectEmployees() {
			
			return driver.findElement(Employees);
		}
		//7
		public WebElement EnterPhone() {
			
			return driver.findElement(Phone);
		}
		//8
		public WebElement SelectCountry() {
			
			return driver.findElement(Country);
		}

}


