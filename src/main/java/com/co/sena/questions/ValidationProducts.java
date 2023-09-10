package com.co.sena.questions;

import com.co.sena.userinterfases.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationProducts implements Question<String>{
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ProductsPage.TXT_VERIFICACION_PRDTS).viewedBy(actor).asString();
    }
    public static ValidationProducts validationProducts(){
        return new ValidationProducts();
    }
}
