package TestCases;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Login;

import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TC_HomePage 
{
	public static WebDriver driver;
	public static Logger log=LogManager.getLogger(TC_HomePage.class);
	
    @BeforeMethod
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
    }
        
	
	  @Test(priority=1) 
	  public void homepage_whats_next() {
	  PageFactory.initElements(driver, Login.class); Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class); HomePage.whatnext.click();
	  if(HomePage.whatnextvalidation.isDisplayed()) {
	  log.info(HomePage.whatnextvalidation.getText()); } else { log.warn("Failed");
	  } }
	  
	  @Test(priority=2) 
	  public void homepage_women() {
	  PageFactory.initElements(driver, Login.class); Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class); HomePage.women.click();
	  if(HomePage.womenvalidation.isDisplayed()) {
	  log.info(HomePage.womenvalidation.getText()); } else { log.warn("Failed"); }
	  }
	  
	  @Test(priority=3) 
	  public void homepage_men() {
	  PageFactory.initElements(driver, Login.class); Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class); HomePage.men.click();
	  if(HomePage.menvalidation.isDisplayed()) {
	  log.info(HomePage.menvalidation.getText()); } else { log.warn("Failed"); } }
	  
	  @Test(priority=4) public void homepage_gear() {
	  PageFactory.initElements(driver, Login.class); Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class); HomePage.gear.click();
	  if(HomePage.gearvalidation.isDisplayed()) {
	  log.info(HomePage.gearvalidation.getText()); } else { log.warn("Failed"); } }
	  
	  @Test(priority=5) public void homepage_training() {
	  PageFactory.initElements(driver, Login.class); Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class); HomePage.training.click();
	  if(HomePage.trainingvalidation.isDisplayed()) {
	  log.info(HomePage.trainingvalidation.getText()); } else { log.warn("Failed");
	  } }
	  
	  @Test(priority=6) public void homepage_sale() {
	  PageFactory.initElements(driver, Login.class); Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class); HomePage.sale.click();
	  if(HomePage.salevalidation.isDisplayed()) {
	  log.info(HomePage.salevalidation.getText()); } else { log.warn("Failed"); } }
	 
  @Test(priority=7)
  public void homepage_myaccount()
  {
	  PageFactory.initElements(driver, Login.class);
	  Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123");
	  Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class);
	  HomePage.custdrpdpwn.click();
	  HomePage.myaccount.click();
	  if(HomePage.myaccountvalidation.isDisplayed())
	  {
	  log.info(HomePage.myaccountvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }

	
	  @Test(priority=8) 
	  public void homepage_myorders() {
	  PageFactory.initElements(driver, Login.class);   
	  Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); 
	  Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class); 
	  HomePage.custdrpdpwn.click();
	  HomePage.myaccount.click();
	  HomePage.myorder.click();
	  if(HomePage.myordervalidation.isDisplayed()) {
	  log.info(HomePage.myordervalidation.getText()); } else { log.warn("Failed");
	  } }
	  
	  @Test(priority=9) public void homepage_mydownloadableproducts() {
	  PageFactory.initElements(driver, Login.class); 
	  Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); 
	  Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class);
	  HomePage.custdrpdpwn.click();
	  HomePage.myaccount.click();
	  HomePage.mydownload.click(); 
	  if(HomePage.mydownloadvalidation.isDisplayed())
	  { log.info(HomePage.mydownloadvalidation.getText()); } else {
	  log.warn("Failed"); } }
	  
	  @Test(priority=10) public void homepage_Mywishlist() {
	  PageFactory.initElements(driver, Login.class); Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class); 
	  HomePage.custdrpdpwn.click();
	  HomePage.myaccount.click();
	  HomePage.mywish.click();
	  if(HomePage.mywishvalidation.isDisplayed()) {
	  log.info(HomePage.mywishvalidation.getText()); } else { log.warn("Failed"); }
	  }
	  
	  @Test(priority=11) 
	  public void homepage_search() {
	  PageFactory.initElements(driver, Login.class); 
	  Login.signIn_link.click();
	  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
	  Login.password.sendKeys("sowmya@123"); 
	  Login.signIn_button.click();
	  PageFactory.initElements(driver, HomePage.class);
	  HomePage.searchfield.sendKeys("bags"); 
	  HomePage.searchbutton.click();
	  if(HomePage.searchvalidtaion.isDisplayed()) {
	  log.info(HomePage.searchvalidtaion.getText()); } 
	  else { log.warn("Failed"); }
	  
	  }
	  
	  @Test(priority=12)
	  public void homepage_myproductreview()
	  {
		  PageFactory.initElements(driver, Login.class); 
		  Login.signIn_link.click();
		  Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
		  Login.password.sendKeys("sowmya@123"); Login.signIn_button.click();
		  PageFactory.initElements(driver, HomePage.class); 
		  HomePage.custdrpdpwn.click();
		  HomePage.myaccount.click();
		  HomePage.myproductreview.click();
		  if(HomePage.myproductrevalidation.isDisplayed())
		  {
		  log.info(HomePage.myproductrevalidation.getText());
		  }
		  else
		  {
			  log.warn("Failed");
		  }
	  }

	   @AfterMethod
  public void CloseDriver() throws InterruptedException {
      Thread.sleep(3000);
      driver.close();
  }
}