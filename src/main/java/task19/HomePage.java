package task19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.qameta.allure.Step;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening home page")
    public void goToHomePage() {
        driver.get("https://hotline.ua/");
    }

    @Step("Click on \"See more products\" button ")
    public void seeMoreProducts() {
        WebElement moreButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), \"Дивитися ще\")]")));
        moreButton.click();
    }

    @Step("Count \"blocks\" of popular products")
    public int countOfPopularProducts() {
        List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'popular-products-section__grid')]/div")));
        return products.size();
    }

    @Step("Get value of products number")
    public int getNumberOfProducts() {
        WebElement numberOfProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@data-v-2f2a6e4c]/span[1]")));
        return Integer.valueOf(numberOfProducts.getText());
    }

    @Step("Opening authorization page")
    public void goToAuthorizationPage() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-tracking-id=\"global-15\"]"))).click();
    }

    @Step("Opening categories page")
    public void goToCategoryPage(String categoryName) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//a[@data-eventlabel=\"%s\"]", categoryName)))).click();
    }

    @Step("Change theme")
    public void changeTheme () {
        WebElement modeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tracking-id=\"global-20\"]")));
        modeButton.click();
    }

    @Step("Get current theme")
    public String getCurrentTheme () {
        WebElement mode = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html")));
        return mode.getAttribute("class");
    }
}
