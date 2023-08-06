package pom.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.base.basecomponents.BaseComponent;
import pom.pages.HomePage;

public class HeaderComponent extends BaseComponent {
    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@id='menu-item-1226']//a[contains(text(),'Home')]")
    private WebElement homeMenuElement;

    public HomePage clickHomeMenuItem(){
        //getWait2().until(ExpectedConditions.elementToBeClickable(homeMenuElement)).click();
        homeMenuElement.click();

        return new HomePage(getDriver());
    }
}
