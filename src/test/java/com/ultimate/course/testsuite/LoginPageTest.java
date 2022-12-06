package com.ultimate.course.testsuite;

import com.ultimate.course.pages.HomePage;
import com.ultimate.course.pages.LoginPage;
import com.ultimate.course.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Test


    public void verifyUserShouldOnLogin(){
        homePage.clickOnLogin();
        Assert.assertEquals(loginPage.getLoginText(), "Welcome Back!", "not Verified");
    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnLogin();
        loginPage.enterUserName("tv@gmail.com");
        loginPage.enterPassword("Indra112");
        loginPage.clickOnSignIn();
        Assert.assertEquals(loginPage.getErrorMessage(),"Invalid email or password.","Not verify");
    }

}
