package com.co.sena.questions;

import com.co.sena.userinterfases.VerifyBuy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationBuyProducts implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VerifyBuy.TXY_VERIFICACTION_1).viewedBy(actor).asString();
    }
    public static ValidationBuyProducts validationBuyProducts(){
        return new ValidationBuyProducts();
    }
}
