package task13;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        String searchWord = "iPhone";
        String errorMessage = format("Title does not contains %s", searchWord);
        WebDriver driver = new EdgeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();


            WebElement inputField = driver.findElement(By.xpath("//input"));
            inputField.sendKeys(searchWord);

            sleep(2000);

            WebElement searchButton = driver.findElement(By.xpath("//button[starts-with(@class, 'search__btn ')]"));
            searchButton.click();

            sleep(2000);

            WebElement title = driver.findElement(By.xpath("//div[@class='search__title']"));
            String titleText = title.getText();

            Assert.assertTrue(errorMessage, titleText.contains(searchWord));
            
        } finally {
            driver.quit();
        }

    }
}
