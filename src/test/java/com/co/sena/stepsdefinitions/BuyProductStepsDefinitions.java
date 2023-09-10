package com.co.sena.stepsdefinitions;

import com.co.sena.models.DatesBuy;
import com.co.sena.questions.ValidationBuyProducts;
import com.co.sena.tasks.*;
import com.co.sena.userinterfases.VerifyBuy;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class BuyProductStepsDefinitions

{
    @When("^i select a product and i enter dates$")
    public void iSelectAProductAndIEnterDates(List<DatesBuy>datesBuys) {
        DatesBuy datesBuy;
        datesBuy=datesBuys.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(HomeTask.ToBuy());
        OnStage.theActorInTheSpotlight().attemptsTo(BuyProducts.buyProducts());
        OnStage.theActorInTheSpotlight().attemptsTo(ConfirmBuy.confirmBuy(datesBuy));

    }


    @Then("^i recibe my buy$")
    public void iRecibeMyBuy() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationBuyProducts.validationBuyProducts(), Matchers.is("Checkout: Overview")));
    OnStage.theActorInTheSpotlight().attemptsTo(FinalizeBuy.finalizeBuy());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
