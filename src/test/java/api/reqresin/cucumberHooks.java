package api.reqresin;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;


public class cucumberHooks {

    @Before
    public static void beforeAll(){
        System.out.println("selalu dieksekusi sekali di awal");
        RestAssured.baseURI = "https://reqres.in/api";
    }

    @After
    public static void afterAll(){
        System.out.println("selalu dieksekusi sekali di akhir");
    }

}
