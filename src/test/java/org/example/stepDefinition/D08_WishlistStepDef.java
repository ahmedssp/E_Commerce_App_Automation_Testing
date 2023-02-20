package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef {

    @When("click on wishlist button ❤️ on this product HTC One M8 Android L 5.0 Lollipop")
    public void White(){
        hooks.d.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).get(2).click();
        hooks.d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Then("success message The product has been added to your wishlist with green background color")
    public void successMessageTheProductHasBeenAddedToYourWishlistWithGreenBackgroundColor() {
        SoftAssert s=new SoftAssert();
        s.assertTrue(hooks.d.findElement(By.cssSelector("p[class=\"content\"]")).getText().contains(" wishlist"));
        s.assertEquals(Color.fromString(hooks.d.findElement(By.cssSelector("div[class=\"bar-notification success\"] ")).getCssValue("background-color")).asHex(),"#4bb07a");
        s.assertAll();
    }
    @Then("Qty product has been added to your wishlist")
    public void Qty() {
        WebDriverWait wait = new WebDriverWait(hooks.d, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class=\"bar-notification success\"]")));
        String y= hooks.d.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();
        Assert.assertTrue(y.contains("(1)"));
        Assert.assertFalse(y.contains("(0)"));
        System.out.println();

//        SoftAssert s=new SoftAssert();
//        s.assertTrue(hooks.d.findElement(By.cssSelector("p[class=\"content\"]")).getText().contains(" wishlist"));
//        s.assertEquals(Color.fromString(hooks.d.findElement(By.cssSelector("div[class=\"bar-notification success\"] ")).getCssValue("background-color")).asHex(),"#4bb07a");
//        s.assertAll();

    }
}
