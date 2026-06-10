package task21;

import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AuthorizationPage extends BasePage {

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public boolean login(String userLogin, String userPassword) throws InterruptedException {
        try {
            driver.get("https://hotline.ua/");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-tracking-id=\"global-15\"]"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"social-login__buttons-container\"]")));

            driver.findElement(By.xpath("//div[1]//input")).sendKeys(userLogin);
            driver.findElement(By.xpath("//div[2]//input")).sendKeys(userPassword);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), \"Увійти\")]")));
            button.click();
            return false;
        } catch (ElementClickInterceptedException e) {
            System.out.println("Button is not clickable");
            return true;
        }
    }

}
