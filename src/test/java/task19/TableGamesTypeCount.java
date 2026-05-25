package task19;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;

@Epic("Product result page")
@Feature("Count of sub-categoies")
@Link(name = "Reference",  url = "https://hotline.ua/")
public class TableGamesTypeCount extends BaseTest {

    @Feature("Count of sub-categoies of \"Дача, сад\"")
    @Test(groups = {"positive"})
    public void tableGamesCountCheck() {
        int expectedResult = 9;
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage srp = new SearchResultPage(getDriver());

        homePage.goToHomePage();
        homePage.goToCategoryPage("Дача, сад");
        int actualResult = srp.getCategoryTypesCount();

        Assert.assertEquals(actualResult, expectedResult, "Incorrect size - " + actualResult);
    }

}
