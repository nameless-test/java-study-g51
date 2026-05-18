package task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SiteOptions extends BaseTest {

    @Test(groups = {"positive"})
    public void SingInOptions() throws InterruptedException {
        String[] expectedResult = {"Продовжити через Google", "Продовжити через Apple", "Інші способи авторизації"};
        driver.get("https://rozetka.com.ua/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid=\"header-auth-btn\"]"))).click();
        WebElement buttonArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//rz-auth-social")));
        String[] actualResult = {buttonArea.findElement(By.xpath(".//button[1]")).getText(),
            buttonArea.findElement(By.xpath(".//button[2]")).getText(),
            wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(buttonArea, By.xpath("//rz-auth-social//button[3]"))).get(0).getText()
        };

        for (int n = 0; n < expectedResult.length; n++) {
            Assert.assertEquals(actualResult[n], expectedResult[n], "incorrect sing in method");
        }
    }

    @Test(groups = {"positive"})
    public void TrackPackage() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid=\"menu_button\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"https://rozetka.com.ua/ua/tracking/\"]"))).click();
        WebElement searchArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"searchText\"]")));
        searchArea.sendKeys("1111");
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), \" Відстежити \")]")));

        Assert.assertTrue(button.isEnabled(), "button disabled");
    }
}
