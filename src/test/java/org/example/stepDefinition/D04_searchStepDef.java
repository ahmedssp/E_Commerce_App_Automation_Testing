package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D04_searchStepDef {

    P03_homePage pag=new P03_homePage();

    @And("^User Search for ([^\"]*) product$")
    public void x(String product_name) throws InterruptedException {
                hooks.d.findElement(By.id("small-searchterms")).sendKeys(product_name);
                hooks.d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
                Thread.sleep(300);
    }

    @Then("soft assertion to verify {string} search")
    public void softAssertionToVerifyProductSearch(String product_name) {
        int i=0;String t=null;
        SoftAssert soft=new SoftAssert();
        //1- assert  url contains https://demo.nopcommerce.com/search?q=
        soft.assertTrue(hooks.d.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        //2- assert results contains Search key word
        for(int x=0;x<pag.producname.size();x++){
            soft.assertTrue(pag.producname.get(i).getText().strip().toLowerCase().contains(product_name));
        }
        soft.assertAll();
    }

    @Then("soft assertion to verify {string} name")
    public void softAssertionToVerifySKutSearch(String sku) {
        int i=0;
        SoftAssert soft=new SoftAssert();
        //1- assert  url contains https://demo.nopcommerce.com/search?q=
        soft.assertTrue(hooks.d.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        //2- assert results contains Product SDK name
        for(int x=0;x<pag.producname.size();x++){
            pag.producname.get(i).click();
            soft.assertTrue(pag.SDK_NAME.getText().equals(sku));
        }
        soft.assertAll();

    }
}
