package com.co.sena.userinterfases;

import net.serenitybdd.screenplay.targets.Target;

public class VerifyBuy {
    public static final Target TXY_VERIFICACTION_1=Target.the("Texto de verificacion").locatedBy("//span[text()=\"Checkout: Overview\"]");
    public static final Target BTN_VERIFICADO=Target.the("Boton de verificacion").locatedBy("//button[@id=\"finish\"]");
}
