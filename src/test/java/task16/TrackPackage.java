package task16;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrackPackage {

    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36 Edg/148.0.0.0");
        WebDriver driver = new EdgeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            driver.get("https://rozetka.com.ua/");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid=\"menu_button\"]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"https://rozetka.com.ua/ua/tracking/\"]"))).click();
            WebElement searchArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"searchText\"]")));
            searchArea.sendKeys("1111");
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), \" Відстежити \")]")));

            Assert.assertTrue("incorrect text", button.isEnabled());

        } finally {
            driver.quit();
        }
    }
}
