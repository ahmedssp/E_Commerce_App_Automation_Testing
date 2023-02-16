package org.example.pages;

import org.example.stepDefinition.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    public WebElement Login_page()
    {return  hooks.d.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));}
    public WebElement email()
    {return  hooks.d.findElement(By.cssSelector("input[id=\"Email\"]"));}
    public WebElement password()
    {return  hooks.d.findElement(By.cssSelector("input[id=\"Password\"]"));}
     public WebElement loggin_prss()
     {return  hooks.d.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));}


//    public WebElement current_url()
//    {return  hooks.d.getCurrentUrl()}

//    public  P02_login(){PageFactory.initElements(hooks.d,this);}
    //    @FindBy(className = "ico-login")
//      public WebElement login_page;"input[id="Email"]"
//    @FindBy(id = "Email")
//    public WebElement email;
//    @FindBy(id = "Password")
//    public WebElement password;
}
