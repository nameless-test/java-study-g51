package task18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToHomePage() {
        driver.get("https://hotline.ua/");
    }

    public void seeMoreProducts() {
        WebElement moreButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), \"Дивитися ще\")]")));
        moreButton.click();
    }

    public int countOfPopularProducts() {
        List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'popular-products-section__grid')]/div")));
        return products.size();
    }

    public int getNumberOfProducts() {
        WebElement numberOfProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@data-v-2f2a6e4c]/span[1]")));
        return Integer.valueOf(numberOfProducts.getText());
    }

    public void goToAuthorizationPage() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-tracking-id=\"global-15\"]"))).click();
    }

    public void goToCategoryPage(String categoryName) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//a[@data-eventlabel=\"%s\"]", categoryName)))).click();
    }
}
