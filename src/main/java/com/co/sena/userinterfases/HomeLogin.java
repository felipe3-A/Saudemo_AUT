package com.co.sena.userinterfases;

import net.serenitybdd.screenplay.targets.Target;

public class HomeLogin {
    public static final Target TXT_TITLE=Target.the("texto de verificacion").locatedBy("//*[text()=\"Products\"]");
    public static final Target BTN_P_1=Target.the("producto 1").locatedBy("(//button[@class=\"btn btn_primary btn_small btn_inventory\"])[1]");
    public static final Target BTN_P_2=Target.the("producto 1").locatedBy("(//button[@class=\"btn btn_primary btn_small btn_inventory\"])[2]");
    public static final Target BTN_P_3=Target.the("producto 1").locatedBy("(//button[@class=\"btn btn_primary btn_small btn_inventory\"])[3]");
    public static final Target A_CARR=Target.the("carrito de compras").locatedBy("//a[@class=\"shopping_cart_link\"]");


}
