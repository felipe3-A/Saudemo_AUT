package com.co.sena.tasks;


import com.co.sena.userinterfases.CofirmBuyEx;
import com.co.sena.userinterfases.VerifyBuy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FinalizeBuy implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(VerifyBuy.BTN_VERIFICADO));
    }
    public static FinalizeBuy finalizeBuy(){
        return Tasks.instrumented(FinalizeBuy.class);
    }
}
