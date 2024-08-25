package org.bankguru;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class Testcase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    WebDriver driver;
    String pathData = "/driver/";
    String userPath = System.getProperty("user.dir");
    String pathDriver = userPath.concat(pathData).concat("chromedriver.exe");

    @BeforeClass
    public void beforeClass()
    {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();

    }
    @Test
    public void AppTest()
    {
        driver.get("http://live.guru99.com/");
    }
    @AfterClass
    public void AfterClass()
    {
        driver.quit();
    }

}
