package pages;

import base.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseModel {

    public BasePage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }
}
