package task20;

import org.testng.Assert;

import io.restassured.response.Response;

public class DeletePetTest {

    public void deletePet (int id) {
        ApiMethods api = new ApiMethods();

        Response info = api.deletePet(id, "special-key");

        Assert.assertTrue(info.statusCode() == 404, "Request passed");

    }
}
