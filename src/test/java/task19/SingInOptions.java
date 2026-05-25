package task19;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Story;

@Epic("Sing in page")
@Feature("Sing in options")
@Link(name = "Reference",  url = "https://hotline.ua/ua/login/")
public class SingInOptions extends BaseTest {

    @Story("Count of Sing in options")
    @Test(groups = {"positive"})
    public void checkSingInOptions() {
        String[] expectedResult = {"Продовжити через Google", "Продовжити через Apple", "Продовжити через Facebook"};
        HomePage homePage = new HomePage(getDriver());
        AuthorizationPage authorizationPage = new AuthorizationPage(getDriver());

        homePage.goToHomePage();
        homePage.goToAuthorizationPage();
        String[] actualResult = authorizationPage.getSingInOptions();

        for (int n = 0; n < expectedResult.length; n++) {
            Assert.assertEquals(actualResult[n], expectedResult[n], "incorrect sing in method");
        }
    }

}
