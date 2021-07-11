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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditAccount {
  WebDriver driver;
  
  public void EditAccount(WebDriver driver) {
	  this.driver = driver;
	  
  }
  
  @FindBy(linkText="Edit Account")
  WebElement edacc;
  
  @FindBy(name="accountno")
  WebElement accno;
  
  @FindBy(name="AccSubmit")
  WebElement submit;
  
  @FindBy(name="a_type")
  WebElement selacc;
  
  @FindBy(name="AccSubmit")
  WebElement accsubmit;
  
  
  public void editacc() throws IOException {
	  
	  edacc.click();
	  accno.sendKeys("94805");
	  submit.click();
	  
	  Select sel = new Select(selacc);
	  sel.selectByVisibleText("Savings");	  
	  accsubmit.click();
	  
  }
}
