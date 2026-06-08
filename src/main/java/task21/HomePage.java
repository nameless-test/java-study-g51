package task21;

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

    public void goToCategoryPage(String categoryName) {
        driver.get("https://hotline.ua/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//a[@data-eventlabel=\"%s\"]", categoryName)))).click();
    }

}
