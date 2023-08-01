package tests.base;

import org.testng.annotations.BeforeMethod;
import utils.AutoConfig;
import base.BaseModel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BaseModel {

    @BeforeMethod
    public void setUp() {
        startDriver();
        openUrl();
    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }

    private void openUrl() {
        getDriver().get(AutoConfig.getUrl());
    }
}
