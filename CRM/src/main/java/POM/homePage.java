package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    @FindBy(xpath="/html/body/div[1]/div/div[2]/ul/li[1]/a") private WebElement home;
    @FindBy(xpath="//a[@href=\"/Students/Contact\"]") private WebElement ajaxcall;
     @FindBy(xpath="//a[@href=\"/Students/Form\"]") private WebElement from;
     @FindBy(xpath="//input[@id=\"firstname\"]") private WebElement name;
	 @FindBy(xpath="//input[@id=\"lastname\"]") private WebElement lname;
	 @FindBy(xpath="//button[@type=\"submit\"]") private WebElement submit;
     @FindBy(xpath="//input[@class=\"form-control\"]") private WebElement enter;
     @FindBy(xpath="/html/body/div[1]/div/div[2]/ul/li[6]/a") private WebElement action;
     @FindBy(xpath="(//input[@name=\"optradio\"])[2]") private WebElement radio;

     
    	 public  homePage (WebDriver driver) {
           	PageFactory.initElements(driver, this);
           
     }



     public void clickhome() {
   	  home.click();
   	  
     }
    
     public void clickajaxcall() {
   	  ajaxcall.click();
     }

     public void clickfrom1() {
   	  from.click();

     }
     
     public void entername(String username) {
   	  
   	  name.sendKeys(username);
    }
     
     public void enter(String user) {
   	  enter.sendKeys(user);
     }
     public void clickact() { 
   	  action.click();
   	  
     }
     public void clickradio() {
   	  radio.click();
     }
     public void last(String Lasname) {
    	 lname.sendKeys(Lasname);
     }

     public void button() {
	  submit.click();
}
}
