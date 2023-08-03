package pages.base;

import base.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseModelPage extends BaseModel {

    public BaseModelPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }
}
