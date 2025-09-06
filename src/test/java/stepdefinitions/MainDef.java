package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class MainDef {

	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;

	LoginPage loginPage;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		String expResult = "https://www.nobroker.in/";
		String actResult = driver.getCurrentUrl();
		Assert.assertEquals(actResult, expResult);
	}
	
	//scenario_01
	@When("the user enters a invalid phone number")
	public void the_user_enters_a_invalid_phone_number() {
		loginPage = new LoginPage(driver, extTest);
		loginPage.clickLogin();
		loginPage.enterMobileNumber("8ed3d456");
	}
	@Then("an error message {string} should be shown")
	public void an_error_message_should_be_shown1(String string) {
		
	}
	
	//scenario_02
	@When("the user enters a valid phone number and invalid OTP")
	public void the_user_enters_a_valid_phone_number_and_invalid_otp() {
		loginPage = new LoginPage(driver, extTest);
		loginPage.clickLogin();
		loginPage.enterMobileNumber("8967322456");
		loginPage.enterOtp("573852");
	}
	@Then("an error message {string} should be shown")
	public void an_error_message_should_be_shown(String string) {
	    
	}

	//scenario_03
	@When("the user enters a valid phone number and OTP")
	public void the_user_enters_a_valid_phone_number_and_otp() {
		loginPage = new LoginPage(driver, extTest);
		loginPage.clickLogin();
		loginPage.enterMobileNumber("8967322456");
	}

	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {
		
	}

}
