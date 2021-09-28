package com.facebook.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.pages.Loginpage;
import com.facebook.utilities.Xlutility;

public class TC_logDDT_002 extends BaseClass {
	@Test(dataProvider="logindata")
	public void loginDDT(String user,String pwd) {
		Loginpage lp=new Loginpage(driver);
		logger.info("Enter user name");
		lp.setEmail(user);
		lp.setPassword(pwd); 
		lp.clickBotton();
	}
	@DataProvider(name="logindata")
	public String[][] getdata() throws IOException {
		String path="C:\\Users\\HOME\\eclipse-workspace\\facebook\\configfiles\\gmail..xlsx";
		int rownum=Xlutility.getRowCount(path, "Sheet1");
		int colcount=Xlutility.getCellCount(path, "Sheet1", 1);
        String logindata[][] =new String[rownum][colcount];
        for(int i=1;i<=rownum;i++) {
        	for(int j=0;j<colcount;j++) {
        		logindata[i-1][j]=Xlutility.getCellData(path, "Sheet1", i, j);
        	}
        }
        return logindata;
	}
}
