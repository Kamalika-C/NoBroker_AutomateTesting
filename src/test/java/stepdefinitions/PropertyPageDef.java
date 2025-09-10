package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PropertyPage;

public class PropertyPageDef {
	
	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;
	
	PropertyPage propertyPage;

	@Given("User is on House Rent page")
    public void user_is_on_house_rent_page() {
		String actResult = driver.getCurrentUrl();
		Assert.assertTrue(actResult.contains("https://www.nobroker.in/property/rent/chennai/Velachery"));
    }
	
	@When("User selects sort by")
	public void user_selects_sort_by() {
		propertyPage=new PropertyPage(driver, extTest);
		propertyPage.clickSortBy();
	}
	
	@When("user selects sorting options")
	public void user_selects_sorting_option() {
		propertyPage.selectSortingOption();

	}
	
	@Then("Property list should display in sorted")
	public void property_list_should_display_in_sorted() {
	    boolean isSorted = propertyPage.isPropertyListSortedNewToOld();
	    Assert.assertTrue(isSorted, "Property list is not displayed in New → Old order");
	    extTest.log(Status.PASS, "Property list is displayed in New → Old order");
	}
	
	@When("User views image of property card")
    public void user_views_image_of_property_card() {
		propertyPage=new PropertyPage(driver, extTest);
        boolean isDisplayed = propertyPage.validateFirstPropertyImageDisplayed();
        Assert.assertTrue(isDisplayed, "Property image is not displayed");
    }

    @Then("Property images should be displayed")
    public void property_images_should_be_displayed() {
        boolean navigated = propertyPage.clickImageAndValidateDetailPage();
        Assert.assertTrue(navigated, "Property detail page did not open after clicking image");
    }


//	
//	@When("User enters invalid location {string} in location search")
//	public void user_enters_invalid_location_in_location_search(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("click on Search")
//	public void click_on_search() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	@Then("Application should show error for invalid location")
//	public void application_should_show_error_for_invalid_location() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User searches multiple localities")
//	public void user_searches_multiple_localities() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	@Then("Application should validate multiple locality search limit")
//	public void application_should_validate_multiple_locality_search_limit() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User views image of property card")
//	public void user_views_image_of_property_card() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	@Then("Property images should be displayed")
//	public void property_images_should_be_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks extreme filter")
//	public void user_clicks_extreme_filter() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	@Then("Application should validate property search with extreme filters")
//	public void application_should_validate_property_search_with_extreme_filters() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User selects multiple filters")
//	public void user_selects_multiple_filters() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	@Then("Filter count should increment accordingly")
//	public void filter_count_should_increment_accordingly() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
