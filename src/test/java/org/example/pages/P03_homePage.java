package org.example.pages;

import org.example.stepDefinition.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {
    public  P03_homePage(){PageFactory.initElements(hooks.d,this);}

    @FindBy(id="customerCurrency")
    public WebElement Currency;

    @FindBy(className="prices")
    public List<WebElement> prod;


}
