package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	@FindBy(id="ui-id-3")
	public static WebElement whatnext;
	
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span") 
	public static WebElement whatnextvalidation;
	
	@FindBy(id="ui-id-4")
	public static WebElement women;
	
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement womenvalidation;
	
	@FindBy(id="ui-id-5")
	public static WebElement men;
	
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement menvalidation;
	
	@FindBy(id="ui-id-6")
	public static WebElement gear;
	
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement gearvalidation;
	
	@FindBy(id="ui-id-7")
	public static WebElement training;
	
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement trainingvalidation;
	
	@FindBy(id="ui-id-8")
	public static WebElement sale;
	
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement salevalidation;
	
	@FindBy (xpath ="/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	public static WebElement custdrpdpwn;
	
	@FindBy (xpath ="html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")
	public static WebElement myaccount;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement myaccountvalidation;
	
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")
	public static WebElement myorder;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement myordervalidation;
	
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[3]/a")
	public static WebElement mydownload;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement mydownloadvalidation;
	
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[4]/a")
	public static WebElement mywish;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement mywishvalidation;
	
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[10]/a")
	public static WebElement myproductreview;

	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement myproductrevalidation;
	
	@FindBy(xpath="//*[@id=\"search\"]")
	public static WebElement searchfield;
	
	@FindBy(xpath="//*[@id=\"search\"]")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/h1/span")
	public static WebElement searchvalidtaion;


}
