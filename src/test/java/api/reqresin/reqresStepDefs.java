package api.reqresin;


import api.reqresin.Reqresin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.instanceOf;


public class reqresStepDefs {

    Reqresin reqres = new Reqresin();
    @When("user send GET list resource")
    public void userSendGETListResource() {
        reqres.getListResource();
    }

    @Then("response status code should be {int}")
    public void responseShouldBe(int statusCode) {
        Assert.assertEquals(statusCode, Reqresin.response.statusCode());
    }


    @And("response body should be equal with jsonSchema {string}")
    public void responseBodyShouldBeEqualWithJsonSchema(String jsonSchema) {
        //mengambil file json dari folder schema
        String path = "schema/" + jsonSchema;
        Reqresin.response.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(path));
    }

    @When("user send POST login request with body {string}")
    public void userSendPOSTLoginRequestWithBody(String bodyName) {

        //mengambil file json dari folder payload
        String path = "src/test/resources/payload/" + bodyName;
        File bodyJson = new File(String.format(path));
        reqres.postLogin(bodyJson);
    }

    @When("user send GET single list resource")
    public void userSendGETSingleListResource() {
        reqres.getSingleListResource();
    }

    @When("user send POST register request with body {string}")
    public void userSendPOSTRegisterRequestWithBody(String bodyName) {
        //mengambil file json dari folder payload
        String path = "src/test/resources/payload/" + bodyName;
        File bodyJson = new File(String.format(path));
        reqres.postRegister(bodyJson);
    }

    @When("user send POST create request with body {string}")
    public void userSendPOSTCreateRequestWithBody(String bodyName) {
        //mengambil file json dari folder payload
        String path = "src/test/resources/payload/" + bodyName;
        File bodyJson = new File(String.format(path));
        reqres.postCreate(bodyJson);
    }

    @When("user send PUT update request with body {string}")
    public void userSendPUTUpdateRequestWithBody(String bodyName) {
        //mengambil file json dari folder payload
        String path = "src/test/resources/payload/" + bodyName;
        File bodyJson = new File(String.format(path));
        reqres.putUpdate(bodyJson);
    }

    @When("user send DEL request to delete user by id")
    public void userSendDELRequestToDeleteUser() {
        reqres.delUser();
    }

    /*@And("response body with jsonPath {string} should have type String")
    public void responseBodyWithJsonPathShouldHaveTypeString(String jsonPath) {
        assert Reqresin.response.body().jsonPath().get(jsonPath) instanceof String; //mengecek response
    }*/

}
