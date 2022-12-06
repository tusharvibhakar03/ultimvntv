package com.ultimate.course.pages;

import com.ultimate.course.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By loginPage = By.linkText("Sign In");
    By loginText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By signIn = By.xpath("//input[@type='submit']");

    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public String getLoginText(){
        return getTextFromElement(loginText);
    }
    public void enterUserName(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
    public void clickOnSignIn(){
        clickOnElement(signIn);
    }

}