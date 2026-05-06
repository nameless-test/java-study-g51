package task13;

import static java.lang.String.format;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CatalogCount {
    public static void main(String[] args) {
        

        WebDriver driver = new EdgeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            List <WebElement> catalogElements = driver.findElements(By.xpath("//div[@class=\"categories-section__inner\"]//a"));
            int catalogElementsCount = catalogElements.size();

            System.out.println(format("Catalog elements count = %s", catalogElementsCount));

        } finally {
            driver.quit();
        }
    }
}
