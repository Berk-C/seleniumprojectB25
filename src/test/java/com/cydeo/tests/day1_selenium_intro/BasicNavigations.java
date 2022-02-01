package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3- Go to tesla.com
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 second
        Thread.sleep(3000);

        //Use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 second
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        // use selenium to navigate refresh
        driver.navigate().refresh();

        //use navigate().to():
        driver.navigate().to("https://google.com");
    }
}
