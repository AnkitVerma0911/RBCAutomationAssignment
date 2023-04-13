package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class APITest {
	private String endpoint;
    private String titleToSearch;
    private Response response;
    @Given("the user has access to the search API endpoint")
    public void the_user_has_access_to_the_search_api_endpoint() {
    	endpoint = "http://example.com/api/posts";
    }
    @When("the user searches for posts with title \"\"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\"\"")
    public void the_user_searches_for_posts_with_title_sunt_aut_facere_repellat_provident_occaecati_excepturi_optio_reprehenderit() {
    	 titleToSearch = "sunt aut facere repellat provident occaecati excepturi optio reprehenderit";
         response = RestAssured.given()
                 .queryParam("title", titleToSearch)
                 .when()
                 .get(endpoint);
    }
    @When("the user searches for posts with title {string}")
    public void userSearchesForPostsWithTitle(String title) {
        titleToSearch = title;
        response = RestAssured.given()
                .queryParam("title", titleToSearch)
                .when()
                .get(endpoint);
    }
    @Then("the API should return a list of posts that match the title")
    public void apiShouldReturnListOfPostsThatMatchTitle() {
        Assert.assertEquals(200, response.getStatusCode());
        String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains(titleToSearch));
    }
}
