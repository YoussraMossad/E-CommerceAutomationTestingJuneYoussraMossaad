package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hoverCategories;
import org.example.pages.home;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_hoverCategories {
    home home;
    P05_hoverCategories category;
    String subCategoryName;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {
        home = new home(Hooks.driver);
        category = new P05_hoverCategories(Hooks.driver);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(home.computers()).perform();
        action.moveToElement(home.computers()).perform();

        subCategoryName = home.desktops().getText().toLowerCase();

        Thread.sleep(1000);
    }
    @And("user click on subcategory")
    public void user_clicks_subcategory(){
        home.desktops().click();
    }

    @Then("user go to relative product page")
    public void relative_subcategory(){
        Assert.assertEquals(category.categoryList().getText().toLowerCase(),subCategoryName,"subcategory");
    }
}
