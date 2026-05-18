package task16;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TableGames {

    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36 Edg/148.0.0.0");
        WebDriver driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        int expectedResult = 9;

        try {
            driver.get("https://hotline.ua/");
            driver.findElement(By.xpath("//a[@data-eventlabel=\"Дача, сад\"]")).click();

            List<WebElement> gamesTypes = driver.findElements(By.xpath("//ul[@class=\"category-navigation content\"]//li"));

            Assert.assertTrue("icorrect count of elements", expectedResult == gamesTypes.size());

        } finally {
            driver.quit();
        }
    }
}
