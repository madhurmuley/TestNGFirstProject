package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import PageObjectModel.LoginPageObjects;

public class BaseClass {

	public WebDriver driver;
	public WebDriver browserLaunch() throws IOException {
		
		//this will help us to read data.properties
		FileInputStream fis=new FileInputStream("C:\\Users\\Torus\\eclipse-workspace\\20thJuneTestNGframework\\src\\main\\java\\Resources\\data.properties");
		//this will access data.properties

		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Torus\\Desktop\\chrome jars\\chromedriver.exe");
	    
			driver = new ChromeDriver();
	    }else if(browserName.equalsIgnoreCase("firefox")) {
			
			// firefox code with path
		}else {
		
			System.out.println("please select valid broser");
		}
			return driver;
	
	}

	@BeforeMethod
	
	public void lauchbrowser() throws IOException {
		
		browserLaunch();
		// this driver have scope
		driver.get("https://login.salesforce.com/?locale=in");
		 
		
	
		
	}
}
