package com.automation.amazon;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPage extends BaseWebPage {
	
	
        private By clickonsigninlabel = By.xpath(".//*[@id='nav-link-yourAccount']/span[1]");
	    private By email = By.xpath(".//*[@id='ap_email']");
	    private By password = By.id("ap_password");
	    private By signinButton = By.id("signInSubmit");
	    
	    @Step("click on signin label")
	    public void clickonsigninlabel(){
	    	clickOn(clickonsigninlabel);
	    }
	    @Step("Enter username")
	    public void enterUsername(String enterUsername) {
	        sendKeys(email, enterUsername);
	    }
	    
	    @Step("Enter Password")
	    public void enterPassword(String enterPasword) {
	        sendKeys(password, enterPasword);
	    }
	    
	    @Step("Click on signin button")
	    public void clickOnLoginButton() {
	        clickOn(signinButton);
	    }
	    
	    
	}

