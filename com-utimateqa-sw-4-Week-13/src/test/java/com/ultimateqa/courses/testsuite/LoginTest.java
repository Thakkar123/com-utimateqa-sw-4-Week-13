package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homepage = new HomePage();
    SignInPage signinpage = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        homepage.clickOnSignInLink();
        String actualMessage = signinpage.getWelcomeBackText();
        Assert.assertEquals(actualMessage,"Welcome Back!","error");
    }

    @Test
    public void verifyTheErrorMessage(){
        homepage.clickOnSignInLink();
        signinpage.enterEmail("abc@gmail.com");
        signinpage.enterPassword("abc123");
        signinpage.clickOnSignInButton();
        String actualErrorMessage = signinpage.getErrorMessageText();
        Assert.assertEquals(actualErrorMessage,"Invalid email or password.","error");
    }
}
