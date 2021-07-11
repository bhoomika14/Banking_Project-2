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

public class Withdrawal {
	
	WebDriver driver;
	
	public void Withdrawal(WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy(linkText="Withdrawal")
	WebElement withdraw;
	
	@FindBy(name="accountno")
	WebElement accno;
	
	@FindBy(name="ammount")
	WebElement amount;
	
	@FindBy(name="desc")
	WebElement descript;
	
	@FindBy(name="AccSubmit")
	WebElement submit;
	
	
	public void withdrawamount() throws IOException{
		withdraw.click();
		accno.sendKeys("94805");
		amount.sendKeys("100");
		descript.sendKeys("Withdraw");
		submit.click();
	}
}
