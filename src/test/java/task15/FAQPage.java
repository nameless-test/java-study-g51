package task15;

import static java.lang.Thread.sleep;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FAQPage {
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        WebDriver driver = new EdgeDriver(options);
        String expectedResult = "FAQ для користувачів";


        try {
            driver.get("https://hotline.ua/");
            sleep(3000);

            WebElement link = driver.findElement(By.xpath("//a[@data-tracking-id=\"global-26\"]"));

            new Actions(driver)
            .keyDown(Keys.CONTROL)
            .click(link)           
            .keyUp(Keys.CONTROL)  
            .build()
            .perform();

            sleep(3000);

            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }

            String actualResult = driver.findElement(By.xpath("//h1")).getText();
            
            Assert.assertEquals("incorrect text", expectedResult, actualResult);

        } finally {
            driver.quit();
        }
    }

}
