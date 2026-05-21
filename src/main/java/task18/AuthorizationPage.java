package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AuthorizationPage extends BasePage {

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public String[] getSingInOptions() {
        WebElement buttonArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"social-login__buttons-container\"]")));
        String[] actualResult = {buttonArea.findElement(By.xpath(".//button[1]")).getText().trim(),
            buttonArea.findElement(By.xpath(".//button[2]")).getText().trim(),
            buttonArea.findElement(By.xpath(".//button[3]")).getText().trim()
        };
        return actualResult;
    }

}
