package com.co.sena.tasks;

import com.co.sena.userinterfases.HomeLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeLogin.BTN_P_1));
        actor.attemptsTo(Click.on(HomeLogin.BTN_P_2));
        actor.attemptsTo(Click.on(HomeLogin.BTN_P_3));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(HomeLogin.A_CARR));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static HomeTask ToBuy(){
        return Tasks.instrumented(HomeTask.class);
    }
}
