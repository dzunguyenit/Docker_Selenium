package com.docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class dockerTesting
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    WebDriver driver;
    ChromeOptions chromeOptions;

    @BeforeClass
    public void beforeClass() {
        try {

            chromeOptions = new ChromeOptions();
            URL url = new URL("http://localhost:4444/wd/hub");
            driver = new RemoteWebDriver(url, chromeOptions);
        }
        catch (Exception e){
            System. out.println("An error occurred: " + e.getMessage());

        }

        driver = new ChromeDriver(chromeOptions);
    }
    @Test
    public void AppTest()
    {
        driver.get("http://live.guru99.com/");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("----------- CurrentUrl = " +currentUrl);
        Assert.assertTrue(currentUrl.contains("live.techpanda.org"));
    }
    @AfterClass
    public void AfterClass()
    {
        System.out.println("\n--------Quit--------");
        driver.quit();
        System.out.println("\n--------Passed--------");
    }

}
