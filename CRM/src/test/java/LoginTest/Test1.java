package LoginTest;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.homePage;
import pojo.Launchbrowser;

public class Test1 {
	WebDriver driver;
 
	@BeforeMethod
  
	public void openurl() throws InterruptedException{
		
		 driver=Launchbrowser.chrome("http://www.uitestpractice.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	}
	@Test(priority=2)
	public void home() {
		
		homePage pom= new homePage(driver);
		pom.clickhome();
		pom.enter("chavan");
		} 
	
	  @Test(priority=1)
	  public void doubleclick() {
		WebElement doubleclick = driver.findElement(By.xpath("//button[@name=\"dblClick\"]"));
		Actions act= new Actions(driver);
		act.moveToElement(doubleclick).doubleClick().build().perform();
		
		Alert a=   driver.switchTo().alert();
		a.getText();
		
	  }
		
	
	
	
	
	
	
	
	
	
	
}
