package tests.base;

import base.BaseModel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.AutoConfig;

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
