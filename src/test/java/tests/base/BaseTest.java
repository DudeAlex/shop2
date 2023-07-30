package tests.base;

import Utils.AutoConfig;
import base.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest extends BaseModel {

    @BeforeTest
    public void setUp(){
       AutoConfig.configureDriver(getDriver());
    }
    @AfterMethod
    public void tearDown(){
        quitDriver();
    }
}
