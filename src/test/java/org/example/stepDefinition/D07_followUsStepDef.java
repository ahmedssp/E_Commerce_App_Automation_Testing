package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
@When("user opens {string} link")
    public void FACE(String areg){
    String X="//a[contains(text(),'"+areg+"')]";
    hooks.d.findElement(By.xpath(X)).click();
    hooks.d.switchTo().window(new ArrayList<>(hooks.d.getWindowHandles()).get(1));
    }

    @Then("page{string} is opened in new tab")
    public void facebookIsOpenedInNewTab(String arg) {
        Assert.assertEquals(hooks.d.getCurrentUrl(),arg);
        hooks.d.close();
        hooks.d.switchTo().window(new ArrayList<>(hooks.d.getWindowHandles()).get(0));
    }
}

