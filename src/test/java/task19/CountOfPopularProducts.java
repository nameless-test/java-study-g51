package task19;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Story;


@Epic("Main Page")
@Feature("Categories")
@Link(name = "Reference",  url = "https://hotline.ua/")
public class CountOfPopularProducts extends BaseTest {

    @Story("Count of categories")
    @Description("Counts the number of categories on main page")
    @Test(groups = {"positive"})
    public void categoriesCount() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToHomePage();
        homePage.seeMoreProducts();
        int expectedResult = homePage.countOfPopularProducts();
        int actualResult = homePage.getNumberOfProducts();

        Assert.assertEquals(actualResult, expectedResult, "incorrect count");
    }
}
