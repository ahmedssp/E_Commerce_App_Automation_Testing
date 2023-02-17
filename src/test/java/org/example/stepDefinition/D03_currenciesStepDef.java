package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;

public class D03_currenciesStepDef {
    P03_homePage curr= new P03_homePage();
    @When("User select Currencies{string}from hom page")
    public void Currencies(String arg){
        new Select(curr.Currency).selectByVisibleText(arg);
      //    new Select(hooks.d.findElement(By.cssSelector("select[id=\"customerCurrency\"]"))).selectByVisibleText("Euro");

        // ArrayList<String> li = new ArrayList<String>();
//        for(int i=0;i<2;i++){
//            new Select(hooks.d.findElement(By.cssSelector("select[id=\"customerCurrency\"]"))).selectByIndex(i);
//            li.add(hooks.d.findElements(By.cssSelector("select[id=\"customerCurrency\"]  option")).get(i).getText());
//        }
//        System.out.println(li);
    }

    @Then("assertion products displayed {string}currency")
    public void assertionProductsDisplayedCurrency(String arg0) {

        for (int i=0;i<4;i++){
            Assert.assertTrue(hooks.d.findElements(By.className("prices")).get(i).getText().contains(arg0));
            //or
            Assert.assertTrue(curr.prod.get(i).getText().contains(arg0));
        }

    }
}
