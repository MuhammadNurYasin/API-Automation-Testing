package api.reqresin;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.io.File;

public class Reqresin {

    public static Response response;

    /*public Response postLogin(String email, String password){
        JSONObject bodyData = new JSONObject();
        bodyData.put("email", email);
        bodyData.put("password", password);

        return RestAssured.given()
                .headers("Content-type", "application/json")
                .body(bodyData.toString())
                .post("https://reqres.in/api/login");
    }
    public Response postRegister(String email, String password) {
        JSONObject bodyData = new JSONObject();
        bodyData.put("email", email);
        bodyData.put("password", password);

        return RestAssured.given()
                .headers("Content-type", "application/json")
                .body(bodyData.toString())
                .post("https://reqres.in/api/register");
    }*/

    public void getListResource() {
        response = RestAssured.get("/unknown");

    }

    public void postLogin(File body){
        response = RestAssured.given()
                .headers("Content-type", "application/json")
                .body(body).post("/login");
    }

    public void getSingleListResource() {
        response = RestAssured.get("/unknown/2");
    }

    public void postRegister(File body){
        response = RestAssured.given()
                .headers("Content-type", "application/json")
                .body(body).post("/register");
    }

    public void postCreate(File body){
        response = RestAssured.given()
                .headers("Content-type", "application/json")
                .body(body).post("/users");
    }
    public void putUpdate(File body){
        response = RestAssured.given()
                .body(body).put("/users/2");
    }

    public void delUser(){
        response = RestAssured.delete("api/users/2");
    }


}
