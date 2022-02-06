package LoginTest;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.homePage;
import pojo.Launchbrowser;

public class test3 {
	WebDriver driver;
	@BeforeMethod
	  
	public void openurl() throws InterruptedException{
		
		 driver=Launchbrowser.chrome("http://www.uitestpractice.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
	}
	 @Test(priority=1)
	  public void list() throws InterruptedException {
		WebElement up= driver.findElement(By.xpath("//a[@href=\"/Students/Widgets\"]"));
		up.click();
		Thread.sleep(1000);
		
		WebElement file= driver.findElement(By.xpath("//input[@type=\"file\"]"));
		file.sendKeys("C:\\Users\\swadeep\\Desktop\\text.txt");
		WebElement uplode= driver.findElement(By.xpath("//input[@type=\"button\"]"));
		uplode.click();
	
	 }
}
