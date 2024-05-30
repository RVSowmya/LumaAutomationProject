package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp {
    WebDriver driver;
    public SignUp(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath  = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
    public static WebElement signUp;    
    
    @FindBy(id = "firstname")
    public static WebElement FirstName;
    
    @FindBy(id = "lastname")
    public static WebElement LastName;
    
    @FindBy(id = "email_address")
    public static WebElement Email;
    
    @FindBy(id = "password")
    public static WebElement Password;
    
    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmPswd;
    
    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button/span")
    public static WebElement CreateAccountbutton;
    
    //By signup_button = By.xpath(".//button[@title=\"Create an Account\"]");
    
    public void sign_up(){
        driver.findElement((By) signUp).click();
    }
    public void enter_firstName(String fname){
        driver.findElement((By) FirstName).sendKeys(fname);
    }
    public void enter_lastName(String lname){
        driver.findElement((By) LastName).sendKeys(lname);
    }
    public void enter_email(String emailid){
        driver.findElement((By) Email).sendKeys(emailid);
    }
    public void enter_password(String pswd){
        driver.findElement((By) Password).sendKeys(pswd);
    }
    public void enter_confirmPassword(String cpswd){
        driver.findElement((By) ConfirmPswd).sendKeys(cpswd);
    }
    public void enter_signup_button(){
        driver.findElement((By) CreateAccountbutton).click();
    }
}
