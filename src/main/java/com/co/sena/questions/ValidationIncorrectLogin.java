package com.co.sena.questions;

import com.co.sena.userinterfases.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationIncorrectLogin implements Question<Boolean> {
    @Override
    public Boolean  answeredBy(Actor actor) {
        //return Text.of(LoginPage.TXT_ERROR_VALIDATE).viewedBy(actor).asString();
        return LoginPage.TXT_USERNAME.resolveFor(actor).getAttribute("value").contains("usuario1");
    }
    public  static ValidationIncorrectLogin validationIncorrectLogin(){
        return new ValidationIncorrectLogin();
    }
}
