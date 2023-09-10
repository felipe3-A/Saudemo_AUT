package com.co.sena.userinterfases;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME=Target.the("enter user").locatedBy("//input[@id=\"user-name\"]");
    public static final Target TXT_PASS=Target.the("enter pass").locatedBy("//input[@id=\"password\"]");
    public static final Target BTN_LOGIN=Target.the("enter click").locatedBy("//input[@id=\"login-button\"]");
    public static final Target TXT_ERROR_VALIDATE=Target.the("text validate error").locatedBy("//*[text()=\"Epic sadface: Username and password do not match any user in this service\"]");
}
