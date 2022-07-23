package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class P08_wishList {
    WebDriver driver;

    public P08_wishList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public int wishListItems(){
        int size = driver.findElements(By.cssSelector("div[class=\"wishlist-content\"]")).size();
        return size;
    }
}
