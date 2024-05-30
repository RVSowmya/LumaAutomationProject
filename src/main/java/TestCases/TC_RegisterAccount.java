package TestCases;

import Pages.Login;
import Pages.SignUp;
//import Pages.TestNGListeners;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

//@Listeners(TestNGListeners.class)
public class TC_RegisterAccount {
    WebDriver driver = null;

    @BeforeMethod
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
    }
    @Test(priority = 1)
    public void SignUp_with_valid_inputs(){
    	PageFactory.initElements(driver, SignUp.class);
    	SignUp.signUp.click();
    	SignUp.FirstName.sendKeys("sowmya");
    	SignUp.LastName.sendKeys("RV");
    	SignUp.Email.sendKeys("sowmya.raminivangapally@gmail.com");
    	SignUp.Password.sendKeys("sowmya@123");
    	SignUp.ConfirmPswd.sendKeys("sowmya@123");
    	SignUp.CreateAccountbutton.click();
		
    }
    @Test(priority = 2)
    public void SignUp_with_Invalid_email(){
    	PageFactory.initElements(driver, SignUp.class);
    	SignUp.signUp.click();
    	SignUp.FirstName.sendKeys("sowmya");
    	SignUp.LastName.sendKeys("RV");
    	SignUp.Email.sendKeys("gbfuagbaukgbs");
    	SignUp.Password.sendKeys("sowmya@123");
    	SignUp.ConfirmPswd.sendKeys("sowmya@123");
    	SignUp.CreateAccountbutton.click();
        
    }
    @Test(priority = 3)
    public void SignUp_with_empty_inputs(){
    	PageFactory.initElements(driver, SignUp.class);
    	SignUp.signUp.click();
    	SignUp.CreateAccountbutton.click();
    	
    }
    @Test(priority = 4)
    public void SignUp_with_invalid_password_with_length(){
    	PageFactory.initElements(driver, SignUp.class);
    	SignUp.signUp.click();
    	SignUp.FirstName.sendKeys("sowmya");
    	SignUp.LastName.sendKeys("RV");
    	SignUp.Email.sendKeys("sowmya.raminivangapally@gmail.com");
    	SignUp.Password.sendKeys("ab12");
    	SignUp.ConfirmPswd.sendKeys("ab12");
    	SignUp.CreateAccountbutton.click();
    }
    
    @Test(priority = 5)
    public void SignUp_with_invalid_password_with_numbers(){
    	PageFactory.initElements(driver, SignUp.class);
    	SignUp.signUp.click();
    	SignUp.FirstName.sendKeys("sowmya");
    	SignUp.LastName.sendKeys("RV");
    	SignUp.Email.sendKeys("sowmya.raminivangapally@gmail.com");
    	SignUp.Password.sendKeys("12421");
    	SignUp.ConfirmPswd.sendKeys("12421");
    	SignUp.CreateAccountbutton.click();
    }
    @Test(priority = 6)
    public void SignUp_with_invalid_password_with_alphabets(){
    	PageFactory.initElements(driver, SignUp.class);
    	SignUp.signUp.click();
    	SignUp.FirstName.sendKeys("sowmya");
    	SignUp.LastName.sendKeys("RV");
    	SignUp.Email.sendKeys("sowmya.raminivangapally@gmail.com");
    	SignUp.Password.sendKeys("12421");
    	SignUp.ConfirmPswd.sendKeys("12421");
    	SignUp.CreateAccountbutton.click();
    }
    @Test(priority = 7)
    public void SignUp_with_password_and_confirmPswd(){
    	PageFactory.initElements(driver, SignUp.class);
    	SignUp.signUp.click();
    	SignUp.FirstName.sendKeys("sowmya");
    	SignUp.LastName.sendKeys("RV");
    	SignUp.Email.sendKeys("sowmya.raminivangapally@gmail.com");
    	SignUp.Password.sendKeys("sowmya@123");
    	SignUp.ConfirmPswd.sendKeys("sowmya@12");
    	SignUp.CreateAccountbutton.click();
    }
    
    
    @AfterMethod
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
