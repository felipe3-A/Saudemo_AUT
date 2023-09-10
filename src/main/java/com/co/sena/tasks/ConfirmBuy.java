package com.co.sena.tasks;

import com.co.sena.models.DatesBuy;
import com.co.sena.userinterfases.CofirmBuyEx;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ConfirmBuy implements Task {
    DatesBuy datesBuy;

    public ConfirmBuy(DatesBuy datesBuy) {
        this.datesBuy = datesBuy;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datesBuy.getName()).into(CofirmBuyEx.TXT_NAME));
        actor.attemptsTo(Enter.theValue(datesBuy.getSurname()).into(CofirmBuyEx.TXT_SURNAME));
        actor.attemptsTo(Enter.theValue(datesBuy.getZip_code()).into(CofirmBuyEx.TXT_ZIP));
        actor.attemptsTo(Click.on(CofirmBuyEx.BTN_CONTINUE));
    }

    public static ConfirmBuy confirmBuy(DatesBuy datesBuy){
        return Tasks.instrumented(ConfirmBuy.class,datesBuy);
    }
}
