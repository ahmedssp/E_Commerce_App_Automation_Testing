package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    @Given("first slider is clickable on home page")
    public void first_slider_clickabl(){
        hooks.d.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

    }

    @Then("direct user to first product successfully")
    public void directUserToFirstProductSuccessfully() {
        Assert.assertEquals(hooks.d.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @Given("Second slider is clickable on home page")
    public void secondSliderIsClickableOnHomePage() {
        hooks.d.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]")).click();

    }
    @Then("direct user to Second product successfully")
    public void directUserToSecondProductSuccessfully() {
        Assert.assertEquals(hooks.d.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
    }

}

