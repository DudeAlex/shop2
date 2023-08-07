package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pom.base.basepages.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(), 'Raining Offers')]")
    private WebElement homePageTopic;

    @FindBy(xpath="//a[@href='/store']")
    private WebElement shopNowButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getHomePageTitle(){
        return homePageTopic.getText();
    }

    public StorePage navigateToStorePageViaShopNow() {
        shopNowButton.click();

        return new StorePage(getDriver());
    }
}
