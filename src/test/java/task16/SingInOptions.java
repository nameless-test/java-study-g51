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

public class SingInOptions {

    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36 Edg/148.0.0.0");
        WebDriver driver = new EdgeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String[] expectedResult = {"Продовжити через Google", "Продовжити через Apple", "Інші способи авторизації"};

        try {
            driver.get("https://rozetka.com.ua/");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid=\"header-auth-btn\"]"))).click();
            WebElement buttonArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//rz-auth-social")));
            String[] actualResult = {buttonArea.findElement(By.xpath(".//button[1]")).getText(),
                buttonArea.findElement(By.xpath(".//button[2]")).getText(),
                wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(buttonArea, By.xpath("//rz-auth-social//button[3]"))).get(0).getText()
            };

            for (int n = 0; n < expectedResult.length; n++) {
                Assert.assertEquals("incorrect sing in method", expectedResult[n], actualResult[n]);
            }

        } finally {
            driver.quit();
        }
    }
}
