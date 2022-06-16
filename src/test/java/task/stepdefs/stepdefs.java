package task.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefs {
    @When ("user send {string} request to reqresin url")
    public void userSendDELRequestToReqresin(String string) {
        System.out.println(string);
    }

    @Then("user input valid id")
    public void userInputValidId() {
        System.out.println("User memasukkan id yang benar");
    }

    @Then ("response should be {int}")
    public void responseShouldBe204(int number) {
        System.out.println(number);
    }

    @And ("response structure should match json schema")
    public void responseStructureShouldMatchJsonSchema() {
        System.out.println("Struktur response sesuai dengan skema Json");
    }

    @Then("user input invalid id")
    public void userInputInvalidId() {
        System.out.println("User memasukkan id yang salah");
    }

    @Then("user input id with character")
    public void userInputIdWithCharacter()  {
        System.out.println("User memasukkan id dengan bentuk karakter");
    }

    @Then("user input id with special character")
    public void userInputIdWithSpecialCharacter()  {
        System.out.println("User memasukkan id dengan bentuk karakter spesial");
    }

    @Then("user input id with string")
    public void userInputIdWithString()  {
        System.out.println("User memasukkan id dengan bentuk string");
    }
}
