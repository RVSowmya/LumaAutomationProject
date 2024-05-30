package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "email")
    public static WebElement username;
    
    @FindBy(id = "pass")
    public static WebElement password;
    
    @FindBy(name = "send")
    public static WebElement signIn_button;
    
    @FindBy(xpath ="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    public static WebElement signIn_link;

    public void signin(){
        driver.findElement((By) signIn_link).click();
    }
    public void enter_username(String uname){
        driver.findElement((By) username).sendKeys(uname);
    }
    public void enter_password(String pswd){
        driver.findElement((By) password).sendKeys(pswd);
    }
    
   public void clickOnlogin(){
        driver.findElement((By) signIn_button).click();
    }

}
