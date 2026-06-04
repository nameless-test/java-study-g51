package task20;

import java.util.List;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import task20.DTO.CategoryDto;
import task20.DTO.PetDto;
import task20.DTO.TagsDto;

public class ApiMethods {

    public Response createPet(String name, int id) {

        CategoryDto category = new CategoryDto(141, "Dogs");
        List<TagsDto> tags = List.of(new TagsDto(12, "Small dog"));
        List<String> url = List.of("https://thfvnext.bing.com/th/id/OIP.f7_eQu301bnfXirGbVuNnAHaFj?w=248&h=186&c=7&r=0&o=7&cb=thfvnextfalcon&pid=1.7&rm=3",
                "https://thfvnext.bing.com/th/id/OIP.cy-DjN-lYVvKQX-CBrs9rAHaFt?w=196&h=180&c=7&r=0&o=7&cb=thfvnextfalcon&pid=1.7&rm=3"
        );

        PetDto pet = new PetDto(id, category, name, url, tags, "available");

        Response response = given()
                .body(pet)
                .contentType(ContentType.JSON)
                .post("https://petstore.swagger.io/v2/pet");

        System.out.println(response.statusCode());

        return response;

    }

    public Response getPet(int id) {

        Response response = given()
                .pathParam("petId", id)
                .get("https://petstore.swagger.io/v2/pet/{petId}");

        System.out.println(response.statusCode());

        return response;
    }

    public Response putPet(String name, int id) {

        CategoryDto category = new CategoryDto(141, "Dogs");
        List<TagsDto> tags = List.of(new TagsDto(12, "Small dog"));
        List<String> url = List.of("https://thfvnext.bing.com/th/id/OIP.f7_eQu301bnfXirGbVuNnAHaFj?w=248&h=186&c=7&r=0&o=7&cb=thfvnextfalcon&pid=1.7&rm=3",
                "https://thfvnext.bing.com/th/id/OIP.cy-DjN-lYVvKQX-CBrs9rAHaFt?w=196&h=180&c=7&r=0&o=7&cb=thfvnextfalcon&pid=1.7&rm=3"
        );

        PetDto pet = new PetDto(id, category, name, url, tags, "available");

        Response response = given()
                .body(pet)
                .contentType(ContentType.JSON)
                .put("https://petstore.swagger.io/v2/pet");

        System.out.println(response.statusCode());

        return response;

    }

    public Response postUpdatePet(String name, int id, String status) {
        Response response = given()
                .contentType(io.restassured.http.ContentType.URLENC)
                .pathParam("petId", id)
                .formParam("name", name)
                .formParam("status", status)
                .post("https://petstore.swagger.io/v2/pet/{petId}");

        System.out.println(response.statusCode());

        return response;
    }

    public Response deletePet(int id, String apiKey) {
        Response response = given()
                .header("api_key", apiKey)
                .pathParam("petId", id)
                .delete("https://petstore.swagger.io/v2/pet/{petId}");

        System.out.println(response.statusCode());

        return response;
    }

}
