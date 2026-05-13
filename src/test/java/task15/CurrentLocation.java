package task15;

import static java.lang.Thread.sleep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CurrentLocation {
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new EdgeDriver(options);
        
        //Для успішного запуску - змінити локацію:
        String expectedLocation = "Солоне";


        try {
            driver.get("https://hotline.ua/");
            sleep(3000);
            String actualLocation = driver.findElement(By.xpath("//div[@class=\"location__city\"]")).getAttribute("title");
            System.out.println("Current location: " + actualLocation);

            Assert.assertEquals("incorrect city", expectedLocation, actualLocation);

        } finally {
            driver.quit();
        }
    }
}
