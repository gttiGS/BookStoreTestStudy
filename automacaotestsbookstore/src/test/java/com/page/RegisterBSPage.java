package com.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static com.core.DriverFactory.getDriver;

public class RegisterBSPage {

    public RegisterBSPage clickRegister(){
        WebElement btnreg = getDriver().findElement(By.xpath("//a[@href='register.htm']"));
        btnreg.click();
        return this;
    }

    public RegisterBSPage regUser(String user){
        WebElement tfuser = getDriver().findElement(By.name("username"));
        tfuser.sendKeys(user);
        return this;
    }

    public RegisterBSPage regPass(String pass){
        WebElement tfpass = getDriver().findElement(By.name("password"));
        tfpass.sendKeys(pass);        
        return this;
    }

    public RegisterBSPage repeatPass(String pass){
        WebElement tfrptpass = getDriver().findElement(By.name("password2"));
        tfrptpass.sendKeys(pass);
        return this;
    }

    public RegisterBSPage radioGender(){
        WebElement radioGender = getDriver().findElement(By.xpath("//input[@name='gender'][@value='M']"));
        radioGender.click();    
        return this;
    }

    public RegisterBSPage sendAddress(String address){
        WebElement tfaddress = getDriver().findElement(By.name("address"));
        tfaddress.sendKeys(address);    
        return this;
    }

    public RegisterBSPage sendBilling(String billing){
        WebElement tfbilling = getDriver().findElement(By.name("billaddress"));
        tfbilling.sendKeys(billing);
        return this;
    }

    public RegisterBSPage dDownList(){
        WebElement ddstate = getDriver().findElement(By.name("state"));
        Select select = new Select(ddstate);
        select.selectByVisibleText("Tamil Nadu");
        return this;
    }

    public RegisterBSPage checkPolitcs(){
        WebElement politicscheck = getDriver().findElement(By.name("agree"));
        politicscheck.click();    
        return this;
    }

    public RegisterBSPage btnRegister(){
        WebElement regbtn = getDriver().findElement(By.xpath("//input[@type='button'][@value='Register']"));
        regbtn.click();
        return this;
    }

    public String alerttxt(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.getText();
        return alert.getText();
    }

    public RegisterBSPage alert(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        return this;
    }


}
