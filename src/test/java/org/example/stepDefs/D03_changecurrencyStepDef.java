package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.home;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_changecurrencyStepDef {
    org.example.pages.home home;

    @When("user select “Euro” from currency dropdown list")
    public void user_select_Euro() {
        home = new home(Hooks.driver);
        home.currency().click();
        home.currencyEuro().click();
    }

    @Then("All $ sign change to € sign")
    public void product_currency() {
        int count = Hooks.driver.findElements(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).size();
        for (int x = 0; x < count; x++){
            String text = home.productPrices().getText();
            Assert.assertTrue(text.contains("€"));
        }
    }
}
