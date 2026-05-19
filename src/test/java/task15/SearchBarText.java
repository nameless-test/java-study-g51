package task15;

import static java.lang.Thread.sleep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SearchBarText {

    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new EdgeDriver(options);
        String expectedResult = "Знайти товар, магазин, бренд";

        try {
            driver.get("https://hotline.ua/");
            sleep(3000);
            String actualResult = driver.findElement(By.xpath("//input")).getAttribute("placeholder");

            Assert.assertEquals("incorrect text", expectedResult, actualResult);

        } finally {
            driver.quit();
        }
    }
}
