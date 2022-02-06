package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class frompage {
	 @FindBy(xpath="//a[@href=\"/Students/Form\"]") private WebElement from;
	 @FindBy(xpath="//input[@id=\"firstname\"]") private WebElement fname;
	
	 @FindBy(xpath="//input[@id=\"lastname\"]") private WebElement lname;
	 @FindBy(xpath="(//input[@name=\"optradio\"])[2]") private WebElement radio;

 public void from() {
	 from.click();
 
 
 }
 public void first(String firstname){
	 fname.sendKeys(firstname);
 }
 
 public void last(String Lasname) {
	 lname.sendKeys(Lasname);
 }
 
}


 