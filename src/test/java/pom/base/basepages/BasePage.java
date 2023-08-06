package pom.base.basepages;

import org.openqa.selenium.WebDriver;
import pom.base.BaseModelPage;
import pom.components.HeaderComponent;

public abstract class BasePage extends BaseModelPage {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public HeaderComponent getHeader(){
        return new HeaderComponent(getDriver());
    }
}
