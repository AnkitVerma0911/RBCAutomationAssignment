package step_definitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Driver;

public class UISearch {
		
		@Given("the user is on the W3Schools homepage")
		public void the_user_is_on_the_w3schools_homepage() {
			Driver.getDriver().get("https://www.w3schools.com/");
		}
		@When("the user enters {string} in the search bar")
		public void the_user_enters_in_the_search_bar(String string) {
	        WebElement searchInput = Driver.getDriver().findElement(By.id("search2"));
	        searchInput.sendKeys(string);
		}
		@When("clicks the search button")
		public void clicks_the_search_button() {
		      WebElement searchButton = Driver.getDriver().findElement(By.id("learntocode_searchbtn"));
		        searchButton.click();
		}
		@Then("the search results page should display {string} related content")
		public void the_search_results_page_should_display_related_content(String string) {
			 WebElement searchResults = Driver.getDriver().findElement(By.xpath("//h2[contains(text(),'HTML')]"));
		        String resultsText = searchResults.getText();
		        Assert.assertTrue(resultsText.contains("HTML"));
		        Driver.getDriver().quit();
		}


	}


