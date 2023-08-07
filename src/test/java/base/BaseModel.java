package base;

import utils.AutoConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseModel {
    private WebDriver driver;
    private WebDriverWait wait2;

    public WebDriver getDriver() {
        return driver;
    }

    public void startDriver(){

        if (driver == null)
            driver = AutoConfig.startDriver();
    }

    public void quitDriver(){
        if(driver != null)
            driver.quit();
        driver = null;
        wait2 = null;
    }

    public WebDriverWait getWait2(){
        if(wait2 == null)
            wait2 = new WebDriverWait(driver, Duration.ofSeconds(2));
        return wait2;
    }
}
