package pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Edit {
  	WebDriver driver;
  	
  	public void Edit(WebDriver driver) {
  		this.driver = driver;
  	}
  
  	@FindBy(linkText="Edit Customer")
	WebElement edcust;
  	
  	@FindBy(name="cusid")
  	WebElement custid;
  	
  	@FindBy(name="AccSubmit")
  	WebElement sub;
  	
  	@FindBy(name="addr")
	WebElement addr;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pin;
	
	@FindBy(name="telephoneno")
	WebElement mobile;
	
//	@FindBy(name="emailid")
//	WebElement email;
//	
//	@FindBy(name="password")
//	WebElement pass;
	
	@FindBy(name="sub")
	WebElement submit;
		  	
  	public void editcust() throws IOException {
  		edcust.click();
  		
  		custid.sendKeys("12944");
  		sub.click();  
  		
  		addr.clear();
  		city.clear();
//  		state.clear();
//  		pin.clear();
//  		mobile.clear();
  		
  		addr.sendKeys("Ashok nagar");
		city.sendKeys("Bangalore");		
//		state.sendKeys("Karnataka");
//		pin.sendKeys("575003");
//		mobile.sendKeys("1234567890");
//		email.sendKeys("jps@yahoo.com");
//		pass.sendKeys("12345");
		
		submit.click();
  	}
  	
}

//Edit Customer