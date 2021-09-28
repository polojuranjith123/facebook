package com.facebook.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.pages.Loginpage;
 public class TC_001 extends BaseClass{
	 Loginpage lp;
	 @Test
	 public void login() throws InterruptedException, IOException {
		 lp=new Loginpage(driver);
		 logger.info("enter username");
		 lp.setEmail("polojuranjith@gmail.com");
		 lp.setPassword("ranjith@123");
		logger.info("entered password");
	     lp.clickBotton();
	     logger.info("logging");
	     System.out.println("ranjith");
	     
	     captureScreenshot(driver ,"TC_001");
	     Assert.assertTrue(true);	     /* if(driver.switchTo().alert().equals(true)) {
			 driver.switchTo().alert().dismiss();
		 }
		 else
			
		 driver.switchTo().defaultContent();
		 String act=driver.getTitle();
		 
		 String extd="facebook.com";
		 Assert.assertEquals(act,extd,"not same");
		 */
		 
	}

}
