package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver ldriver;
	public Loginpage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement pass;
	@FindBy(name="login")
	WebElement login;
	@FindBy(xpath="//a[@aria-label=\"More\"]")
	WebElement more;
	@FindBy(xpath="//span[text()='Pages']")
	WebElement page;
	
	public void setEmail(String user) {
		email.clear();
		email.sendKeys(user);
	}
	public void setPassword(String password) {
		pass.clear();
		pass.sendKeys(password);
	}
	public void clickBotton() {
		login.isEnabled();
		login.click();
		
	}
	public void clickMore() {
		more.isEnabled();
		more.click();
		
	}
	public String pages() {
		return page.getText();
		 
		
	}
	
	

}
