package com.co.sena.userinterfases;

import net.serenitybdd.screenplay.targets.Target;

public class CofirmBuyEx {
    public static final Target TXT_NAME=Target.the("Ingresar nombre").locatedBy("//input[@id=\"first-name\"]");
    public static final Target TXT_SURNAME=Target.the("Ingresar apellido").locatedBy("//input[@id=\"last-name\"]");
    public static final Target TXT_ZIP=Target.the("Ingresar code").locatedBy("//input[@id=\"postal-code\"]");
    public static final Target BTN_CONTINUE=Target.the("boton continuar").locatedBy("//input[@id=\"continue\"]");
}
