package tests.base;

import utils.AutoConfig;
import base.BaseModel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BaseModel {

    @BeforeTest
    public void setUp(){
       configure();
       openUrl();
    }
    @AfterMethod
    public void tearDown(){
        quitDriver();
    }


    private void configure(){
        AutoConfig.configureDriver(getDriver());
    }
    private void openUrl() {
        getDriver().get(AutoConfig.getUrl());
    }
}
