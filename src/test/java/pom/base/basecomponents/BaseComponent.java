package pom.base.basecomponents;

import org.openqa.selenium.WebDriver;
import pom.base.BaseModelPage;

public abstract class BaseComponent extends BaseModelPage {
    public BaseComponent(WebDriver driver) {
        super(driver);
    }
}
