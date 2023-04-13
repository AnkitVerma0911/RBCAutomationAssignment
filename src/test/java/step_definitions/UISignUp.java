package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;
import utils.Driver;

public class UISignUp {
	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	      WebElement signUpButton = Driver.getDriver().findElement(By.id("signupbtn_topnav"));
	      signUpButton.click();
	      WebElement secondSignUpButton = Driver.getDriver().findElement(By.id("signUpFromSignup"));
	      secondSignUpButton.click();
	      
	}
	@When("enters valid credentials in the sign-up form")
	public void enters_valid_credentials_in_the_sign_up_form() {
		WebElement emailInputField = Driver.getDriver().findElement(By.name("email"));
		emailInputField.sendKeys("test@gmail.com");
		WebElement passwordInputField = Driver.getDriver().findElement(By.name("new-password"));
		passwordInputField.sendKeys("password");
	}
	@When("clicks the {string} button")
	public void clicks_the_button(String string) {
		 WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button/span[contains(text(),'Sign up')]"));
		 signUpButton.click();
		
	}

}
