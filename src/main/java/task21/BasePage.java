package task21;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {

    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        
        this.wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
    }
}