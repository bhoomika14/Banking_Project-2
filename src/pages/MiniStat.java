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

public class MiniStat {
  
	WebDriver driver;
	
	public void MiniStat(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	@FindBy(linkText="Mini Statement")
	WebElement min;
	
	@FindBy(name="accountno")
	WebElement accno;
	
	@FindBy(name="AccSubmit")
	WebElement submit;
	
  
	
	public void minstate() throws IOException{
		min.click();
		accno.sendKeys("94805");
		submit.click();
	}
	
	
}
