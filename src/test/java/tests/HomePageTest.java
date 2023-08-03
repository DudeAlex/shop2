package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.pages.HomePage;
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
}
