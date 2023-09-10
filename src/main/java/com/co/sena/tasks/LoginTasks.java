package com.co.sena.tasks;

import com.co.sena.models.Credentials;
import com.co.sena.userinterfases.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTasks implements Task {
    Credentials credentials;

    public LoginTasks(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(LoginPage.TXT_USERNAME));

    actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASS));

    actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static LoginTasks enterDates(Credentials credentials){
        return Tasks.instrumented(LoginTasks.class,credentials);
    }
}
