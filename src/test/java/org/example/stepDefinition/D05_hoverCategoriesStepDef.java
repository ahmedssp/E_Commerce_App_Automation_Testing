package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class D05_hoverCategoriesStepDef {
    P03_homePage handover= new P03_homePage();
    @Given("select of the three main categories")
    public void hoverCategories() throws InterruptedException {


        Actions action = new Actions(hooks.d);
        action.moveToElement(hooks.d.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] li a[href=\"/computers\"] "))).perform();
        action.moveToElement(hooks.d.findElement(By.partialLinkText("Compute"))).perform();

        Thread.sleep(1000);

//        hooks.d.findElement(By.cssSelector("a[href=\"/users/1\"]")).click();

    }


    @And("user select random one{string} of the three sub cateogries")
    public void userSelectRandomOneOfTheThreeSubCateogries( String arg) {
         hooks.d.findElements(By.partialLinkText(arg)).get(0).click();

       // System.out.println(hooks.d.findElements(By.partialLinkText(arg)).get(0).getText());
        //driver.findElement(By.xpath("//h1[contains(text(),'Desktops')]"))
        //div[class="page-title"] h1
    }


    @Then("Assert that the sub-category {string}title")
    public void assertThatTheSubCategoryTitle(String arg1) {
//        Assert.assertTrue(hooks.d.findElement(By.xpath("//h1[contains(text(),'Desktops')]")).getText().toLowerCase().trim().contains(arg1));
        Assert.assertTrue(hooks.d.findElement(By.cssSelector("div[class=\"page-title\"] h1")).getText().toLowerCase().trim().contains(arg1));
    }
}
