package pages;

import base.BaseModel;
import org.openqa.selenium.WebDriver;

public class BasePage extends BaseModel {

    private final WebDriver driver;
    public BasePage(WebDriver driver){

        this.driver = driver;
    }
}
