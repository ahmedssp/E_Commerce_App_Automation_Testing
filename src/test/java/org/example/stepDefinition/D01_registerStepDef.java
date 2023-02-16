package org.example.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register RG=new P01_register();
    //1-
    @Given("user go to register page")
    public void register_page() {RG.register_link.click();}
    //2-
    @When("user select gender type")
    public void userSelectGenderType() {RG.mal.click();}
    //3-
    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String FirstName, String LastName) {
        RG.FirstName.sendKeys(FirstName);
        RG.LastName.sendKeys(LastName);
    }
    //4-
    @And("user enter date of birth")
    public void userEnterDateOfBirth() {

        Select seDay=new Select(RG.Day);
        seDay.selectByIndex(25);

        Select seMonth=new Select(RG.month);
        seMonth.selectByIndex(12);

        Select seYear=new Select(RG.year);
        seYear.selectByValue("1992");

    }
    //5-
    @And("user enter email {string} field")
    public void userEnterEmailField(String arg) {
//        mail=new Faker().internet().safeEmailAddress();
        RG.Email.sendKeys(arg);
    }
    @And("user fills Password fields {string} Config")
    public void userFillsPasswordFields(String pass1) {
        RG.pass1.sendKeys(pass1);
        RG.pass2.sendKeys(pass1);
    }
//6-
//@And("user fills Password fields configuer")
////  public String userFillsPasswordFields() {
////    password =new Faker().internet().password();
////     RG.pass1.sendKeys(password);
////     RG.pass2.sendKeys(password);
////      System.out.println(password);
////      return password;
//}
    //7-
    //7-
    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {RG.reges_putton.click();}
    //8-
    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert assr=new SoftAssert();
        //1- assert txt
        assr.assertTrue(RG.txtmsg.getText().contains("registration completed"));
        //2- assert color
        assr.assertTrue(Color.fromString(RG.txtmsg.getCssValue("color")).asHex().equals("#4cb17c"));
        assr.assertAll();
    }

//    @And("user enter FirstName and LastName")
//    public void userEnterFirstNameAndLastName() {
//        RG.FirstName.sendKeys("automation");
//        RG.LastName.sendKeys("tester");
//
//    }




//    @When("user select gender type")
//    public void user_select_gender_type() {
//        System.out.println("Sp2");
//    }
//    @And("user enter first name {string} and last name {string}")
//    public void user_enter_first_name_and_last_name() {
//        System.out.println("Sp3");
//    }
//    @And("user enter date of birth")
//    public void user_enter_date_of_birth() {
//        System.out.println("Sp4");
//    }
//    @And("user enter email {string} field")
//    public void user_enter_email_field() {
//        System.out.println("Sp5");
//    }
//    @And("user fills Password fields {string} {string}")
//    public void user_fills_password_fields() {
//        System.out.println("Sp6");
//    }
//    @And("user clicks on register button")
//    public void user_clicks_on_register_button() {
//        System.out.println("Sp7");
//    }
//    @Then("success message is displayed")
//    public void success_message_is_displayed() {
//        System.out.println("Sp8");
//    }
}
