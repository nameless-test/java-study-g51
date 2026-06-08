package task21;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogIn extends BaseTest{

    @Test
    public void unsuccessfulLogin () throws InterruptedException {

        String tabeName = "bohdanchykov_usersDataTable";
        String userLogin =  "testUser@test.com";
        String userPassword = "test";

        DBMethods db = new DBMethods();
        db.CreateTable(tabeName);
        db.AddData(tabeName, userLogin, userPassword);
        Map <String, String> info = db.GetData(tabeName);

        String loginDB = "";
        String passwordDB = "";

        for (Map.Entry<String, String> entry : info.entrySet()) {
                loginDB = entry.getKey();
                passwordDB = entry.getValue();
                break;
            }
        
        db.DeleteTable(tabeName);
        
        AuthorizationPage login = new AuthorizationPage(getDriver());
        boolean actualResult = login.login(loginDB, passwordDB);

        Assert.assertTrue(actualResult, "Button is enabled");

    }

}
