package task19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.qameta.allure.Step;

public class BaseTest {

    protected WebDriver driver;

    @Step("Opening browser")
    @BeforeMethod(alwaysRun = true)
    public void browserSetUp() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36 Edg/148.0.0.0");
        driver = new EdgeDriver(options);
    }

    @Step("Closing browser")
    @AfterMethod(alwaysRun = true)
    public void browserClosing() {
        if (driver != null) {
            driver.close();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

}
