package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_register {
    WebDriver driver;
    public P01_register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));

    }

    public WebElement gender()
    {
        WebElement gender= Hooks.driver.findElement(By.id("gender-male"));
        return gender;
    }
    public WebElement firstname()
    {
        return driver.findElement(By.id("FirstName"));
    }
    public WebElement lasttname()
    {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay()
    {
        return driver.findElement(By.name("DateOfBirthDay"));

    }
    public WebElement birthMonth()
    {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthYear()
    {

        return driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement email()
    {
        return driver.findElement(By.id("Email"));

    }
    public WebElement password()
    {
        return driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword()
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerBtn()
    {
        return driver.findElement(By.id("register-button"));
    }

    public WebElement successfulMsg()
    {
        return driver.findElement(By.xpath("//div[@class=\"result\"]"));
    }
}
