package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tast1_YahooTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

      String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

      String actualTitle = driver.getTitle();

      if(actualTitle.equals(expectedTitle)){
          System.out.println("Title is as expected. Verification PASSED!");
      }else{
          System.out.println("Title is NOT as expected. Verification FAILED!");
      }


    }
}
