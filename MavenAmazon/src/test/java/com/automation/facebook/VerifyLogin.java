package com.automation.facebook;

import org.testng.annotations.Test;

import com.automation.amazon.BaseWebPage;
import com.automation.amazon.LoginPage;

import ru.yandex.qatools.allure.annotations.Features;

public class VerifyLogin extends BaseWebPage{
	
	private LoginPage Login = new LoginPage();
	
	@Test(description = "verify invalid login error message")
	@Features("Login feature")
	public void signinverification() throws Exception{
		Login.clickonsigninlabel();
		Login.enterUsername("kpr544");
		Login.enterPassword("123456");
		Login.clickOnLoginButton();
		Login.screen("screenshot1");
		
	}

}
