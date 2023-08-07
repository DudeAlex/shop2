package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.pages.HomePage;
import pom.pages.StorePage;
import tests.base.BaseTest;

public class StorePageTest extends BaseTest {
    @Test
    public void testNavigateToStorePage() throws InterruptedException {
        StorePage storePage = new HomePage(getDriver()).navigateToStorePageViaShopNow();

        String storePageTitle = storePage.getStorePageTitle();

        Assert.assertEquals(storePageTitle, "Store");
    }
}
