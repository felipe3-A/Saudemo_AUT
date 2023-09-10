package com.co.sena.stepsdefinitions;

import com.co.sena.models.Credentials;
import com.co.sena.questions.ValidationLogin;
import com.co.sena.questions.ValidationProducts;
import com.co.sena.tasks.BuyProducts;
import com.co.sena.tasks.EliminateProducts;
import com.co.sena.tasks.HomeTask;
import com.co.sena.tasks.LoginTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomeStepsDefinitions {
    @Managed
    WebDriver webDriver;
    @Before
    public void setup(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }
 @Given("^i enter in the page for buy$")
    public void iEnterInThePageForBuy(List<Credentials> credentials) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
        Credentials credentials1;
        credentials1=credentials.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTasks.enterDates(credentials1));

    }
    @When("^i should select a product$")
    public void iShouldSelectAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(HomeTask.ToBuy());

    }

    @Then("^i will Buy$")
    public void iWillBuy() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuyProducts.buyProducts());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //--------------------------------------TO ELIMINATE PRODUCTS-------------------------------------------------------
    @When("^i didn't two product$")
    public void iDidnTTwoProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(EliminateProducts.eliminateProducts());
    }



}
