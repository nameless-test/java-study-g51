package task20;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.response.Response;
import task20.DTO.PetDto;

public class PutPetTests {

    @Test
    public void verifyPetCanBeModified () {

        String name = "TestName";
        int id = 6564;

        ApiMethods api = new ApiMethods();

        api.createPet(name, id);
        Response info = api.getPet(id);

        Assert.assertTrue(info.statusCode()==200, "Request failed");
        
        PetDto actualPet = info.as(PetDto.class);
        Assert.assertEquals(actualPet.getId(), id, "Id does not match");
        Assert.assertEquals(actualPet.getName(), name, "Name does not match");

        name = "Dog";
        String status = "pending";

        api.postUpdatePet(name, id, status);

        info = api.getPet(id);

        Assert.assertTrue(info.statusCode()==200, "Request failed");

        actualPet = info.as(PetDto.class);

        Assert.assertEquals(actualPet.getStatus(), status, "Id does not match");
        Assert.assertEquals(actualPet.getName(), name, "Name does not match");

        name = "Bobik";

        api.putPet(name, id);
        info = api.getPet(id);
        
        Assert.assertTrue(info.statusCode()==200, "Request failed");

        actualPet = info.as(PetDto.class);

        Assert.assertEquals(actualPet.getName(), name, "Name does not match");

    }
}
