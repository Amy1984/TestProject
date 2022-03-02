package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class LoginPage extends MasterPage {

	public LoginPage() throws Exception {
		super();
	}

	// Click Email or Phone
	public void clickEmailOrPhone() {
		click("EmailOrPhone");
	}

	// Enter Username
	public void enterUsername() {
		enterData("EmailOrPhone", "data1");
	}

	// Click Password
	public void clickPassword() {
		click("Password");
	}

	// Enter Password
	public void enterPassword() {
		enterData("Password", "data2");
	}
	
	// Click Login Button
	public void clickLoginButton() {
		click("LoginButton");
	}
	
	/*public void verify() throws Exception {
		driver.get("https//www.yahoo.com/");
		Thread.sleep(3000);
		verifyEqualAssertion("", "");
	}*/

}
