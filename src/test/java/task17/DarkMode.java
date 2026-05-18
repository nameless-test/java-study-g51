package task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DarkMode extends BaseTest {

    @Test(groups = {"negative"})
    public void changeTheme() throws InterruptedException {
        String expectedResult = "light-mode";
        driver.get("https://hotline.ua/");
        WebElement modeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tracking-id=\"global-20\"]")));
        modeButton.click();

        WebElement mode = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html")));
        String actualResult = mode.getAttribute("class");

        Assert.assertNotEquals(actualResult, expectedResult, "incorrect mode type");

    }
}
