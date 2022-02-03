package automationFrame.testCreation.google.steps.google;


import automationFrame.engine.selenium.DriverFactory;
<<<<<<< HEAD:src/test/java/automationFrame/testCreation/tellotec/steps/google/GoogleSearchSteps.java
import automationFrame.testCreation.google.pages.google.GooglePages;
=======
import automationFrame.testCreation.google.pages.TellotecPages;
>>>>>>> e183745ebe0c9a7f9c8dc19dba486ccf401c4f0c:src/test/java/automationFrame/testCreation/tellotec/steps/TellotecSearchSteps.java
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;



public class TellotecSearchSteps {

    protected TellotecPages google;


    @Given("that I have gone to the Tellotec page")
    public void that_i_have_gone_to_the_tellotec_page() {
        google = new TellotecPages(DriverFactory.getDriver());
        google.navigateToTellotec();
    }

    @When("I add {string} to the search box")
    public void i_add_to_the_search_box(String nameAnimal) throws InterruptedException {

        google.enterSearchCriteria(nameAnimal);

    }

    @When("click the Search Button")
    public void click_the_search_button() {

        google.clickTellotecSearch();
    }


    @Then("the {string} should be mentioned in the results")
    public void should_be_mentioned_in_the_results(String nameAnimal) {

        google = new TellotecPages(DriverFactory.getDriver());
        String searchResult = google.getTitle();
        Assert.assertTrue(searchResult.contains(nameAnimal));


    }


}
