package TestCases;

import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import java.time.Duration;

public class TC_Login {
    WebDriver driver = null;

    @BeforeMethod
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
        
    }
    @Test(priority = 1)
    public void login_with_valid_inputs(){
    	PageFactory.initElements(driver, Login.class);
    	Login.signIn_link.click();
    	Login.username.sendKeys("sowmya.raminivangapally@gmail.com");
    	Login.password.sendKeys("sowmya@1996");
    	Login.signIn_button.click();
       
    }
    
    @Test(priority = 2)
    public void login_with_Invalid_inputs(){
    	PageFactory.initElements(driver, Login.class);
    	Login.signIn_link.click();
    	Login.username.sendKeys("abc@gmail.com");
    	Login.password.sendKeys("invalidpswd");
    	Login.signIn_button.click();
		
    }
    
    @Test(priority = 3)
    public void login_with_empty_inputs(){
    	PageFactory.initElements(driver, Login.class);
    	Login.signIn_link.click();
    	Login.signIn_button.click();
		
    }

    @AfterMethod
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
