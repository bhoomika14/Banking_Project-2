package objects;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Balance;
import pages.ChangePassword;
import pages.CustStat;
import pages.Delete;
import pages.DeleteAccount;
import pages.Deposit;
import pages.Edit;
import pages.EditAccount;
import pages.FundTransfer;
import pages.Login;
import pages.Logout;
import pages.MiniStat;
import pages.NewAccount;
import pages.NewCustomer;
import pages.Withdrawal;

public class TestElements extends baseclass{
	
  @Test
  public void f() throws IOException, Throwable {
	  
	   
      Logger log = Logger.getLogger(TestElements.class);      
      log.debug("Opening website");	  
           
	  Login login1 = PageFactory.initElements(driver, Login.class);	
	  login1.loginpage();
	  log.debug("Logged into website");
	  Thread.sleep(2000);
	  	  
	  NewCustomer test = PageFactory.initElements(driver, NewCustomer.class);
	  test.newcustomer();
	  log.debug("Created new customer");
	  Thread.sleep(2000);	
	  
	  Edit ed = PageFactory.initElements(driver, Edit.class);
	  ed.editcust();
	  log.debug("Edited customer through customer ID");
	  Thread.sleep(2000);
	  	  
	  NewAccount newaccount = PageFactory.initElements(driver, NewAccount.class);
	  newaccount.addaccount();
	  log.debug("Created a new account for a customer");
	  Thread.sleep(2000);
	  	  
	  EditAccount editaccount = PageFactory.initElements(driver, EditAccount.class);
	  editaccount.editacc();
	  log.debug("Edited account for a customer");
	  Thread.sleep(2000);
	  	  
	  Deposit depositamount = PageFactory.initElements(driver, Deposit.class);
	  depositamount.depamount();
	  log.debug("Deposited money in a customer's account");
	  Thread.sleep(2000);
	  
	  
	  Withdrawal withdraw = PageFactory.initElements(driver, Withdrawal.class);
	  withdraw.withdrawamount();
	  log.debug("Money withdrawn by a customer");
	  Thread.sleep(2000);
	  
	  FundTransfer ftransfer = PageFactory.initElements(driver, FundTransfer.class);
	  ftransfer.fundtrans();
	  log.debug("Transferred money to a customer by another customer");
	  Thread.sleep(2000);
	  
	  
	  Balance balanceenq = PageFactory.initElements(driver, Balance.class);
	  balanceenq.bal();
	  log.debug("Balance enquiry");
	  Thread.sleep(2000);
	  
	  
	  MiniStat ministatement = PageFactory.initElements(driver, MiniStat.class);
	  ministatement.minstate();
	  log.debug("Mini statement");
	  Thread.sleep(2000);
	  	  
	  CustStat customizedstat = PageFactory.initElements(driver, CustStat.class);
	  customizedstat.custstatement();
	  log.debug("Customized statement");
	  Thread.sleep(2000);
	  
//	  DeleteAccount deleteacc = PageFactory.initElements(driver, DeleteAccount.class);
//	  deleteacc.delaccount();
//	  Alert alt2 = driver.switchTo().alert();
//	  alt2.accept();
//	  alt2.accept();
//	  log.debug("Deleted account of a customer");
//	  Thread.sleep(2000);
//	  
//	  Delete del = PageFactory.initElements(driver, Delete.class);	
//	  del.deletecust();
//	  Alert alt1 = driver.switchTo().alert();
//	  alt1.accept();
//	  Thread.sleep(500);
//	  alt1.accept();
//	  log.debug("Deleted one customer");
//	  Thread.sleep(2000);
	  	  
	  Logout quit = PageFactory.initElements(driver, Logout.class);
	  quit.logoff();
	  Alert alt4 = driver.switchTo().alert();
	  alt4.accept();
	  log.debug("Logged off");
	  
//	  ChangePassword changepass = PageFactory.initElements(driver, ChangePassword.class);
//	  changepass.changepass();
//	  Alert alt3 = driver.switchTo().alert();
//	  alt3.accept();
	  
  }
}
