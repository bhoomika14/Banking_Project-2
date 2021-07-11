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

public class Balance {
	
	WebDriver driver;
	
	public void Balance(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(linkText="Balance Enquiry")
	WebElement balenq;
	
	@FindBy(name="accountno")
	WebElement accno;
	
	@FindBy(name="AccSubmit")
	WebElement submit;
	
	public void bal() throws IOException{
		balenq.click();
		accno.sendKeys("94802");
		submit.click();
	}
}
