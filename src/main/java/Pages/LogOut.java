package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut {
    WebDriver driver;
    public LogOut(WebDriver driver){
        this.driver = driver;
    }
    
    @FindBy (xpath ="/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
    public static WebElement customer_dpdown;

    @FindBy (xpath ="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
        public static WebElement signout_link;
    
   
    public void click_customer_dpdown(){
        driver.findElement((By) customer_dpdown).click();
    }
    public void signout(){
        driver.findElement((By) signout_link).click();
    }

}
