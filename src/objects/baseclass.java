package objects;

import org.testng.annotations.Test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class baseclass {
  
	WebDriver driver;
	
  @BeforeSuite
  public void beforeSuite() {
	  
	  BasicConfigurator.configure(); //3 lines of code copy to baseclass
      PropertyConfigurator.configure("/src//log4j.properties");
      
	  System.setProperty("webdriver.chrome.driver", "./DriverFolder/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.demo.guru99.com/V4/index.php");
	  driver.manage().window().maximize();
	  
  }

}
