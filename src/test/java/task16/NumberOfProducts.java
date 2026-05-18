package task16;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class NumberOfProducts {

    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36 Edg/148.0.0.0");
        WebDriver driver = new EdgeDriver(options);
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);

        try {
            driver.get("https://hotline.ua/");
            WebElement moreButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), \"Дивитися ще\")]")));
            moreButton.click();

            List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'popular-products-section__grid')]/div")));
            int expectedResult = products.size();

            WebElement numberOfProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@data-v-2f2a6e4c]/span[1]")));
            int actualResult = Integer.valueOf(numberOfProducts.getText());

            Assert.assertEquals("incorrect count", expectedResult, actualResult);

        } finally {
            driver.quit();
        }
    }
}
