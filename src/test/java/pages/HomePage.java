package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h1[contains(text(), 'Raining Offers')]")
    private WebElement homePageTopic;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getHomePageTitle(){
        return homePageTopic.getText();
    }
}
