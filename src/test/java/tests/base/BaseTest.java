package tests.base;

import Utils.AutoConfig;
import base.BaseModel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

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
