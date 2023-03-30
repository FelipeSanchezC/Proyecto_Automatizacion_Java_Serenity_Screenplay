package questions.RegisterUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import tasks.RegisterUser.NewUserSingUp;
import userInterface.RegisterUser.NewUserSingUpUi;

public class ValidateEmailAddressAlreadyExist implements Question<String> {

    private Target mensajeControl;

    public ValidateEmailAddressAlreadyExist(Target mensajeControl) {
        this.mensajeControl = mensajeControl;
    }

    public static ValidateEmailAddressAlreadyExist conMensajeDeControl(Target mensajeControl) {
        return new ValidateEmailAddressAlreadyExist(mensajeControl);
    }

    @Override
    public String answeredBy(Actor actor) {
    return Text.of(NewUserSingUpUi.MENSAJE_CONTROL).answeredBy(actor).toString();
    }
}
