package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.example.pages.home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class D01_registerStepDef {

    P01_register rgs;
    home home;

    @Given("user navigate to register page")
    public void gotoRegisterPage()
    {
        //rgs.registerBtn().click();
        rgs = new P01_register(Hooks.driver);
        home = new home(Hooks.driver);
        home.Navigate_to_RegisterPage().click();
    }

    @And("user choose male or female")
    public void gender (){
        rgs.gender().click();
    }
    @When("user enter valid data")
    public void valid_data() {
        rgs.firstname().sendKeys("Youssra");

        rgs.lasttname().sendKeys("Mossaad");

        Select select = new Select(rgs.birthDay());
        select.selectByIndex(02);

        select = new Select(rgs.birthMonth());
        select.selectByVisibleText("June");

        select = new Select(rgs.birthYear());
        select.selectByValue("1993");


        rgs.email().sendKeys("youssramossaad@gmail.com");


        rgs.password().sendKeys("Password123");
        rgs.confirmPassword().sendKeys("Password123");
    }
    @Then("user press on register button")
    public void user_register_successfully(){
        rgs.registerBtn().click();
    }


}
