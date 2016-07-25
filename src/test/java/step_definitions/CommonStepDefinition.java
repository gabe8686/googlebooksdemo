package step_definitions;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonStepDefinition extends  AbstractStepDef {


    protected WebDriver driver;

    public CommonStepDefinition() {
        driver = Hooks.driver;
    }

    @Given("^the google books page is loaded$")
    public void the_login_page_is_loaded ()throws Throwable {
        driver.get("https://angular-google-books.herokuapp.com/");

    }



    }







