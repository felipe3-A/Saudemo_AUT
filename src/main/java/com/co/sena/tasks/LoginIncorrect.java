package com.co.sena.tasks;

import com.co.sena.models.Credentials;
import com.co.sena.userinterfases.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginIncorrect implements Task {
Credentials credentials;

    public LoginIncorrect(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASS));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static LoginIncorrect validar_login(Credentials credentials){
        return Tasks.instrumented(LoginIncorrect.class,credentials);
    }
}
