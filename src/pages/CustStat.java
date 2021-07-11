package pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CustStat {
  WebDriver driver;
  
  public void CustStat(WebDriver driver) {
	  this.driver=driver;
  }
  
  	@FindBy(linkText="Customised Statement")
  	WebElement custom;
  
  	@FindBy(name="accountno")
	WebElement accno;
	
  	@FindBy(name="fdate")
  	WebElement fdate;
  	
  	@FindBy(name="tdate")
  	WebElement tdate;
  	
  	@FindBy(name="amountlowerlimit")
  	WebElement mintrans;
  	
  	@FindBy(name="numtransaction")
  	WebElement numtrans;
  	 	
	@FindBy(name="AccSubmit")
	WebElement submit;
	
	
	public void custstatement() throws IOException{
		
		custom.click();
		accno.sendKeys("94802"); 
		fdate.sendKeys("1007");
		fdate.sendKeys(Keys.TAB);
		fdate.sendKeys("2021");
		tdate.sendKeys("1107");
		tdate.sendKeys(Keys.TAB);
		tdate.sendKeys("2021");
		mintrans.sendKeys("5000");
		numtrans.sendKeys("2");
		submit.click();
	
	}
	
}
