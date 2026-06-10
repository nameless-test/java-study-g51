package task21;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TableGamesTypeCount extends BaseTest {

    @Test(groups = {"positive"})
    public void tableGamesCountCheck() {
        String tabeName = "bohdanchykov_categoriesDataTable";
        String categoryName =  "Дача, сад";
        String categoryCount = "9";

        DBMethods db = new DBMethods();
        db.CreateTable(tabeName);
        db.AddData(tabeName, categoryName, categoryCount);
        Map <String, String> info = db.GetData(tabeName);

        String categoryNameDB = "";
        String categoryCountDB = "";

        for (Map.Entry<String, String> entry : info.entrySet()) {
                categoryNameDB = entry.getKey();
                categoryCountDB = entry.getValue();
                break;
            }
        
        db.DeleteTable(tabeName);
        
        HomePage homePage = new HomePage(getDriver());
        homePage.goToCategoryPage("Дача, сад");
        
        SearchResultPage srp = new SearchResultPage(getDriver());
        String actualResult = Integer.toString(srp.getCategoryTypesCount());
        
        Assert.assertEquals(actualResult, categoryCountDB, "Incorrect size - " + actualResult);
    }

}
