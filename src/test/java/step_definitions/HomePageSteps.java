package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageSteps extends AbstractStepDef {
    protected WebDriver driver;

    public HomePageSteps() {
        driver = Hooks.driver;
    }



    @When("^the user performs a search for \"(.*?)\"$")
    public void the_user_performs_a_search_for(String arg1) throws Throwable {
        HomePage homePage=new HomePage(driver);
        homePage.enterSearch(arg1);
    }

    @When("^I set the number of books to (\\d+) books$")
    public void i_set_the_number_of_books_to_books(String arg1) throws Throwable {
        HomePage homePage=new HomePage(driver);
        homePage.enterBooks(arg1 );
    }

    @When("^I click update$")
    public void i_click_update() throws Throwable {    // Write code here that turns the phrase above into concrete actions
        HomePage homePage=new HomePage(driver);
        homePage.clickUpdate();


    }


    @Then("^each result listing should contain \"(.*?)\"$")
    public void each_result_listing_should_contain(String arg1) throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.verifyResults(arg1);
    }



}
