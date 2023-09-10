package com.co.sena.tasks;

import com.co.sena.userinterfases.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuyProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductsPage.BTN_BUY_PRODUCTS));
    }
    public static BuyProducts buyProducts(){
        return Tasks.instrumented(BuyProducts.class);
    }
}
