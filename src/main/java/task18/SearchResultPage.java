package task18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public int getCategoryTypesCount() {
        List<WebElement> categoryTypes = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class=\"category-navigation content\"]//li")));
        int countOfCategories = categoryTypes.size();
        return countOfCategories;
    }

}
