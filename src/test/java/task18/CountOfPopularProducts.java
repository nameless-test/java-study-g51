package task18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOfPopularProducts extends BaseTest {

    @Test(groups = {"positive"})
    public void TableGames() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver(), getWait());
        homePage.goToHomePage();
        homePage.seeMoreProducts();
        int expectedResult = homePage.countOfPopularProducts();
        int actualResult = homePage.getNumberOfProducts();

        Assert.assertEquals(actualResult, expectedResult, "incorrect count");
    }
}
