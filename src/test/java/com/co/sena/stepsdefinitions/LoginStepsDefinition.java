package com.co.sena.stepsdefinitions;

import com.co.sena.models.Credentials;
import com.co.sena.questions.ValidationIncorrectLogin;
import com.co.sena.questions.ValidationLogin;
import com.co.sena.tasks.LoginIncorrect;
import com.co.sena.tasks.LoginTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class LoginStepsDefinition {
    @Managed
    WebDriver webDriver;
    @Before
    public void setup(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }



    @Given("^i enter in the page$")
    public void iEnterInThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));

    }


    @When("^i enter credentials$")
    public void iEnterCredentials(List<Credentials>credentials) {
    Credentials credentials1;
    credentials1=credentials.get(0);
    OnStage.theActorInTheSpotlight().attemptsTo(LoginTasks.enterDates(credentials1));

    }

    @Then("^i will be login$")
    public void iWillBeLogin() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLogin.validar(), Matchers.is("Products")));
    }

    //-----------------------------------------LOGIN INCORRECTO----------------------------------------------------------------------
    @When("^i enter wrong credentials$")
    public void iEnterWrongCredentials(List<Credentials>credentialsListfalse) {
    Credentials credentials;
    credentials=credentialsListfalse.get(0);
    OnStage.theActorInTheSpotlight().attemptsTo(LoginIncorrect.validar_login(credentials));

    }

    @Then("^i will not be login$")
    public void iWillNotBeLogin() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationIncorrectLogin.validationIncorrectLogin(),
           Matchers.equalTo(Boolean.TRUE)));
           // Matchers.is("Epic sadface: Username and password do not match any user in this service")));
    }

}
