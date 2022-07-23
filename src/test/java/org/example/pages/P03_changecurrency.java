package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class P03_changecurrency {
    WebDriver driver;

    public List<WebElement> product_currency()
    {
        int count = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).size();
      for(int x=0;x<count;x++)
      {
        String text=  Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).get(x).getText();
          Assert.assertTrue(text.contains("€"));
      }
      return Hooks.driver.findElements(By.className("customerCurrency"));
    }

}
