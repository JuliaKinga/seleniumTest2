package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    @Test

    public void searchTestWithOneKEywordTesct(){

        System.setProperty("webdriver.chrome.driver", "C:\\webdrive\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");


    }
}
