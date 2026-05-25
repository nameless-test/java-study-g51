package task19;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Story;

@Epic("Main Page")
@Feature("Theme")
@Link(name = "Reference",  url = "https://hotline.ua/")
public class DarkMode extends BaseTest {

    @Story("Change theme")
    @Issue("Jira-TEST111")
    @Test(groups = {"negative"})
    public void changeTheme() throws InterruptedException {
        String expectedResult = "dark-mode"; //(failed on purpose)
        HomePage homePage = new HomePage(getDriver());
        homePage.goToHomePage();
        homePage.changeTheme();
        String actualResult = homePage.getCurrentTheme();

        Assert.assertNotEquals(actualResult, expectedResult, "incorrect mode type");

    }
}
