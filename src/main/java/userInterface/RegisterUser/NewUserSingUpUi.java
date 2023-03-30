package userInterface.RegisterUser;

import net.serenitybdd.screenplay.targets.Target;

public class NewUserSingUpUi {

    public static final Target INPUT_NAME = Target.the("Input para ingreso del nombre").locatedBy("//input[@data-qa='signup-name']");
    public static final Target INPUT_EMAIL = Target.the("Input para ingreso del email").locatedBy("//input[@data-qa='signup-email']");
    public static final Target BTN_SIGUP = Target.the("Boton para continuar con el flujo").locatedBy("//button[@data-qa='signup-button']");
    public static final Target MENSAJE_CONTROL = Target.the("Mensade de control email existente").locatedBy("//p[@style='color: red;' and text()='Email Address already exist!']");


}
