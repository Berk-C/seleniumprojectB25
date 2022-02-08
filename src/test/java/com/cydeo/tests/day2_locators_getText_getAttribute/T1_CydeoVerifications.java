package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");


        String expectedURL = "cydeo";

        String actualURL = driver.getCurrentUrl();


        if(actualURL.contains(expectedURL)){
            System.out.println("URL PASS");
        } else {
            System.out.println("URL FAILED");
        }


        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();


        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is matched");
        }else {
            System.out.println("Title is not matched");
        }

        driver.close();



    }
}
