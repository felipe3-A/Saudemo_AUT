package com.co.sena.userinterfases;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
    public static final Target BTN_ELIMINAR=Target.the("eliminar producto 1").locatedBy("(//button[@class=\"btn btn_secondary btn_small cart_button\"])[1]");
    public static final Target BTN_ELIMINAR2=Target.the("eliminar producto 2").locatedBy("(//button[@class=\"btn btn_secondary btn_small cart_button\"])[2]");
    public static final Target TXT_VERIFICACION_PRDTS=Target.the("verificar productos").locatedBy("//*[text()=\"2\"]");
    public static final Target BTN_BUY_PRODUCTS=Target.the("comprar productos").locatedBy("//button[@id=\"checkout\"]");


}
