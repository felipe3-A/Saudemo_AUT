package com.co.sena.questions;

import com.co.sena.userinterfases.HomeLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationLogin implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomeLogin.TXT_TITLE).viewedBy(actor).asString();
    }
    public static ValidationLogin validar(){
        return new ValidationLogin();
    }
}
