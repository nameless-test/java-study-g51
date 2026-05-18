package task16;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DarkMode {

    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36 Edg/148.0.0.0");
        WebDriver driver = new EdgeDriver(options);
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);

        String expectedResult = "dark-mode";

        try {
            driver.get("https://hotline.ua/");
            WebElement modeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tracking-id=\"global-20\"]")));
            modeButton.click();

            WebElement mode = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html")));
            String actualResult = mode.getAttribute("class");

            Assert.assertEquals("incorrect mode type", expectedResult, actualResult);

        } finally {
            driver.quit();
        }
    }
}
