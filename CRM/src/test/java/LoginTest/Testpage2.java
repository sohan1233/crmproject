package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.frompage;
import POM.homePage;
import pojo.Launchbrowser;

public class Testpage2 {
WebDriver driver;
homePage pom1= new homePage(driver);
	@BeforeMethod
	public void openurl() throws InterruptedException{
		
		 driver=Launchbrowser.chrome("http://www.uitestpractice.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	}
	
	  
	@Test(priority=1)
	public void from() throws InterruptedException {
		homePage pom1= new homePage(driver);
		pom1.clickfrom1();
		pom1.last("chavan");
		pom1.entername("sohan");
		pom1.clickradio();
		pom1.button();
		
}

	@AfterTest
	public void dropdown() throws InterruptedException {
	WebElement product=	driver.findElement(By.xpath("//select[@class=\"form-control dropdown-header\"]"));
		Select a= new Select(product);
		a.selectByIndex(5);
		Thread.sleep(1000);
		driver.findElements(By.xpath("//li[@class=\"ui-state-default ui-selectee ui-selected\"]")).size();
	
	}
	
	
}