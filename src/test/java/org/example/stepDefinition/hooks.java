package org.example.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class hooks {
    //create WebDriver
    public static WebDriver d;
    @Before
    public static void  start(){

        //1- creat Bridge
        WebDriverManager.chromedriver().setup();
        //2- creat object of chrome driver
        d= new ChromeDriver();
        //3- implecit wait
        d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //4-open www.google.com
        d.navigate().to("https://demo.nopcommerce.com/");
        //test
//        System.out.println("Before");
    }
    @After
    public static void  quit() throws InterruptedException {
        Thread.sleep(3000);
        d.quit();
        //test
//        System.out.println("After");

    }

}

