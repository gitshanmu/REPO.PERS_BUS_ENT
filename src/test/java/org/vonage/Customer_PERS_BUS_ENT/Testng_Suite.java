package org.vonage.Customer_PERS_BUS_ENT;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import page.classes.Enterprisepage;
import page.classes.Homepage;
import page.classes.Personalpage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Testng_Suite {
	private WebDriver driver;
	private String baseurl;
	Enterprisepage Enterprisepageobj;
	static Logger log = LogManager.getLogger(Testng_Suite.class);
  @Test(groups = {"Group1"})
  public void Test1() throws InterruptedException {
		
		Homepage.NavigatetoPersonal(driver);
		Thread.sleep(2000);
  }
  @Test(groups =  {"Group1"})
  public void Test2() throws InterruptedException {
		
		Personalpage.Navigate_WhyVonagelist1(driver);
		Thread.sleep(2000);
		//Personalpage.NavigatetoPersonaltab(driver);
			
}
  @Test(groups =  {"Group1"})
  public void Test3() throws InterruptedException {
		
		Personalpage.Navigate_WhyVonagelist2(driver);
		Thread.sleep(2000);
			
} 
  @Test(groups =  {"Group1"})
  public void Test4() throws InterruptedException {
		
		Personalpage.Navigate_WhyVonagelist3(driver);
		Thread.sleep(2000);
			
} 
  @Test(groups =  {"Group1"})
  public void Test5() throws InterruptedException {
		
		Personalpage.Navigate_WhyVonagelist4(driver);
		Thread.sleep(2000);
			
}
  @AfterMethod(alwaysRun = true)
  public void AterMethod() throws InterruptedException {
	  Personalpage.NavigatetoPersonaltab(driver);
	  Thread.sleep(2000);
  }
  
  
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  	driver = new FirefoxDriver();
		baseurl= "https://www.vonage.com/";
		Enterprisepageobj = new Enterprisepage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PropertyConfigurator.configure("log4j.properties");
		driver.get(baseurl);
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
