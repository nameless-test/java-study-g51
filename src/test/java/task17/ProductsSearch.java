package task17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsSearch extends BaseTest {

    @Test(dataProvider = "SearchExamples", dataProviderClass = Data.class, groups = {"positive"})
    public void TableGames(String categoryName, int countOfCategory) throws InterruptedException {
        driver.get("https://hotline.ua/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//a[@data-eventlabel=\"%s\"]", categoryName)))).click();

        List<WebElement> gamesTypes = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class=\"category-navigation content\"]//li")));

        Assert.assertEquals(gamesTypes.size(), countOfCategory, "Incorrect size - " + gamesTypes.size());
    }

    @Test(groups = {"positive"})
    public void NumberOfProducts() throws InterruptedException {
        driver.get("https://hotline.ua/");
        WebElement moreButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), \"Дивитися ще\")]")));
        moreButton.click();

        List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'popular-products-section__grid')]/div")));
        int expectedResult = products.size();

        WebElement numberOfProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@data-v-2f2a6e4c]/span[1]")));
        int actualResult = Integer.valueOf(numberOfProducts.getText());

        Assert.assertEquals(actualResult, expectedResult, "incorrect count");
    }
}
