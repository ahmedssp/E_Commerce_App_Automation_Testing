package org.example.pages;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.example.stepDefinition.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_register {
    public  P01_register(){PageFactory.initElements(hooks.d,this);}
    @FindBy(className = "ico-register")
    public  WebElement register_link;
    @FindBy(id="gender-male")
    public WebElement mal;
    @FindBy(id="FirstName")
    public WebElement FirstName;
    @FindBy(id="LastName")
    public WebElement LastName;
    @FindBy(name="DateOfBirthDay")
    public WebElement Day;
    @FindBy(name="DateOfBirthMonth")
    public WebElement month;
    @FindBy(name="DateOfBirthYear")
    public WebElement year;
    @FindBy(id="Email")
    public WebElement Email;
    @FindBy (id="Password")
    public WebElement pass1;
    @FindBy (id="ConfirmPassword")
    public WebElement pass2;
    @FindBy (id="register-button")
    public WebElement reges_putton;
    @FindBy (className="result")
    public WebElement txtmsg;



//    public WebElement register_page(){
//        return hooks.d.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
//    }
//    public WebElement gender_type(){
//    return hooks.d.findElement(By.cssSelector("span[class=\"male\"] input[type=\"radio\"]"));
//
//  }
//
//    public WebElement user_first_name_last_name(){
//        return hooks.d.findElement(By.cssSelector("input[id=\"FirstName\"]"));
//    }


}
