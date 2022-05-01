package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By welcomeBackText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By errorMessageText = By.xpath("//li[contains(text(),'Invalid email or password.')]");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By signInButton = By.cssSelector("input[value='Sign in']");

    public String getWelcomeBackText()
    {
        return getTextFromElement(welcomeBackText);
    }

    public String getErrorMessageText(){

        return getTextFromElement(errorMessageText);
    }

    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnSignInButton(){
        clickOnElement(signInButton);
    }
}
