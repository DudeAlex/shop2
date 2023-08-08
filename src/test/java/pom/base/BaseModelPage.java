package pom.base;

import base.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseModelPage extends BaseModel {

    private final WebDriver driver;
    public BaseModelPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }
}
