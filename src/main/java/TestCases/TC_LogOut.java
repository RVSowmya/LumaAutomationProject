package TestCases;

import Pages.Login;
import Pages.LogOut;
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

public class TC_LogOut {
    WebDriver driver = null;

    @BeforeMethod
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
    }
    @Test
    public void logout(){
    	PageFactory.initElements(driver, Login.class);
    	Login.signIn_link.click();
    	Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
    	Login.password.sendKeys("sowmya@123");
    	Login.signIn_button.click();
    	PageFactory.initElements(driver, LogOut.class);
    	LogOut.customer_dpdown.click();
    	LogOut.signout_link.click();
       
	 }
    @AfterMethod
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
