package cursobdd.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cursobdd.models.DataUser;
import cursobdd.models.SearchData;
import cursobdd.questions.Answer;
import cursobdd.tasks.Login;
import cursobdd.tasks.OpenUp;
import cursobdd.tasks.Search;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ChoucairwikiStepdefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^Browser on the Choucairwiki page$")
    public void browserOnTheChoucairwikiPage(List<DataUser> dataUsers) throws Exception {
       theActorCalled("Jean").wasAbleTo(OpenUp.thePage(), Login.thePage(dataUsers));
    }

    @When("^Search the concept$")
    public void searchTheConcept(List<SearchData> searchData) throws Exception {
        theActorInTheSpotlight().attemptsTo(Search.theConcep(searchData));
    }

    @Then("^search results are displayed$")
    public void searchResultsAreDisplayed(List<SearchData> searchData) throws Exception {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(searchData)));
    }
}
