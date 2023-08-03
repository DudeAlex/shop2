package tests.base;

import base.BaseModel;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.AutoConfig;
import utils.TestUtils;

import java.lang.reflect.Method;

public class BaseTest extends BaseModel {

    @BeforeMethod
    public void setUp() {
        startDriver();
        configureDriver();
        openUrl();
    }

    private void configureDriver() {
        AutoConfig.configureDriver(getDriver());
    }

    @AfterMethod
    public void tearDown(ITestResult testResult, Method method) {
        if(!testResult.isSuccess())
            takeScreenShot(method);
        quitDriver();
    }

    private void takeScreenShot(Method method) {
        TestUtils.takeScreenShot(getDriver(), method);
    }

    private void openUrl() {
        getDriver().get(AutoConfig.getUrl());
    }
}
