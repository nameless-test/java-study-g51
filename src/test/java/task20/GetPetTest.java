package task20;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import task20.DTO.NotFoundDto;

public class GetPetTest {

    @Test
    public void petExist() {
        int id = 232323;

        ApiMethods api = new ApiMethods();

        Response info = api.getPet(id);

        Assert.assertTrue(info.statusCode() == 404, "Request passed");

        NotFoundDto actualPet = info.as(NotFoundDto.class);

        Assert.assertEquals(actualPet.getMessage(), "Pet not found");

    }

}
