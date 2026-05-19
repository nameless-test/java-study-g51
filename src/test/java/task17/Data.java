package task17;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name = "SearchExamples")
    public Object[][] variables() {
        return new Object[][]{
            {"Дача, сад", 9},
            {"Інструменти", 11}
        };
    }
}
