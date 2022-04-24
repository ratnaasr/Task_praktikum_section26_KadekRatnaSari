package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {

    public static String url = "https://reqres.in/api/";


    @Step("I set GET api endpoints")
    public String SetApiEndpoint(){
        return url + "users/2";
    }

    @Step("I send GET HTPP request")
    public void sendGetHttpRequest(){
        SerenityRest.given().get(SetApiEndpoint());
    }

    @Step("I receive valid HTTP response code")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail user")
    public void validateDataDetailUser(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(2)));
        restAssuredThat(response -> response.body("'data'.'first_name'", equalTo("Janet")));
    }
}
