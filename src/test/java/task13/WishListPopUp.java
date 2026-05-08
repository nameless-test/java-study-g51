package task13;

import static java.lang.Thread.sleep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WishListPopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement wishListButton = driver.findElement(By.xpath("//div[@class='popover my-list'] //div[@class='button__icon flex']"));
            wishListButton.click();

            sleep(2000);

            WebElement wishListPopUp = driver.findElement(By.xpath("//div[contains(@class, 'my-list__section')]"));

            Assert.assertTrue(wishListPopUp.isDisplayed());

        } finally {
            driver.quit();
        }
    }
}
