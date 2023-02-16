package org.example.stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login LOG= new P02_login();
//    D01_registerStepDef var=new D01_registerStepDef();
    //1-
    @Given("user go to login page")
    public void user_go_to_login_page() {LOG.Login_page().click();}
    //2-
    @When("user login with  {string} and {string} valid")
    public void userLoginWithAnd(String mail,String passwd) {
        LOG.email().sendKeys(mail);
        LOG.password().sendKeys(passwd);
    }
    //3-
    @And("User press on login button")
    public void userPressOnLoginButton() throws InterruptedException {
       LOG.loggin_prss().click();
       Thread.sleep(1000);
    }
    //4-
    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert As=new SoftAssert();
        //1-assert url
        As.assertEquals(hooks.d.getCurrentUrl(),"https://demo.nopcommerce.com/","Url is not correct!");
        //2-assert
        As.assertEquals(hooks.d.findElement(By.cssSelector("a[href=\"/customer/info\"]")).getText().toLowerCase(),"my account");
        As.assertAll();
    }

    @When("user login with invalid  {string} and {string} valid")
    public void userLoginWithAnd2(String mail,String passwd) {
        LOG.email().sendKeys(mail);
        LOG.password().sendKeys(passwd);
    }

    @Then("user login to the system unsuccessfully")
    public void userLoginToTheSystemUnsuccessfully() {
        SoftAssert As=new SoftAssert();
        //1-assert TXT Unsuccessfully
        String b= hooks.d.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getText().toLowerCase();
        As.assertTrue(b.contains("unsuccessful"));
        //2-assert txt color
        As.assertEquals(Color.fromString(hooks.d.findElement(By.cssSelector(" div[class=\"message-error validation-summary-errors\"]")).getCssValue("color")).asHex(),"#e4434b");
        As.assertAll();

    }
}
