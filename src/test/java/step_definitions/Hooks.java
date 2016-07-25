package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class Hooks{
    public static WebDriver driver;


    @Before

    public void openBrowser() throws MalformedURLException {
        System.out.println("Called openBrowser");
        if(driver==null)
        if(driver == null && StringUtils.isEmpty(System.getProperty("webdriver.chrome.driver")))
        System.setProperty("webdriver.chrome.driver",  "//Applications//chrome//chromedriver");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }


    @After

    public void embedScreenshot(Scenario scenario) {

        if (driver != null){
            driver.quit();
        }
    }
}