package userInterface.LoginUser;

import net.serenitybdd.screenplay.targets.Target;

public class PageLoginAccountUi {

    public static final Target INPUT_EMAIL = Target.the("Ingreso del Email").locatedBy("//input[@data-qa='login-email']");
    public static final Target INPUT_PASSWORD = Target.the("Ingreso del PassWord").locatedBy("//input[@data-qa='login-password']");
    public static final Target BTN_LOGIN = Target.the("Boton de ingreso").locatedBy("//button[@data-qa='login-button']");
    public static final Target MENSAJE_CONTROL_EMAIL = Target.the("Mensaje de control email incorrecto").locatedBy("//p[@style='color: red;']");
    public static final Target TITULO_LOGIN_ACCOUNT = Target.the("Titulo Login account").locatedBy("//h2[text()='Login to your account']");

}

