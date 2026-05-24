package task18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TableGamesTypeCount extends BaseTest {

    @Test(groups = {"positive"})
    public void TableGamesCountCheck() {
        int expectedResult = 9;
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage srp = new SearchResultPage(getDriver());

        homePage.goToHomePage();
        homePage.goToCategoryPage("Дача, сад");
        int actualResult = srp.getCategoryTypesCount();

        Assert.assertEquals(actualResult, expectedResult, "Incorrect size - " + actualResult);
    }

}
