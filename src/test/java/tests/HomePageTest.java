package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.pages.HomePage;
import pom.pages.StorePage;
import tests.base.BaseTest;

public class HomePageTest extends BaseTest {
    @Test
    public void testHomePageTitle(){
        String homePageTitle = new HomePage(getDriver()).getHomePageTitle();

        Assert.assertEquals(homePageTitle, "Raining Offers for Hot Summer!");
    }
    @Test
    public void testHomePageTitle2() {

        String homePageTitle = new HomePage(getDriver()).getHomePageTitle();

        Assert.assertEquals(homePageTitle, "Raining Offers for Hot Summer!");
    }

    @Test
    public void testHeaderHomeMenuItemSendsToHomePage(){
        HomePage homePage = new HomePage(getDriver()).getHeader().clickHomeMenuItem();

        String homePageTitle = homePage.getHomePageTitle();

        Assert.assertEquals(homePageTitle, "Raining Offers for Hot Summer!");
    }
}
