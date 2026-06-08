package task20;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DeletePetTest {

    @Test
    public void deletePet () {
        int id = 232323;
        ApiMethods api = new ApiMethods();

        Response info = api.deletePet(id, "special-key");

        Assert.assertTrue(info.statusCode() == 404, "Request passed");

    }
}
