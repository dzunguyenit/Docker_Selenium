package com.docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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

    @BeforeClass
    public void beforeClass()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("128.0.6613.85");
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
