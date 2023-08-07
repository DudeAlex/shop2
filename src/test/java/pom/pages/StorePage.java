package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pom.base.basepages.BasePage;

public class StorePage extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement title;

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public String getStorePageTitle() throws InterruptedException {

        return title.getText();
    }

}
