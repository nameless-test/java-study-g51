package task18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingInOptions extends BaseTest {

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
