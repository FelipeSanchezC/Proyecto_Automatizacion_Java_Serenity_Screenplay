package questions.loginUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarMensajeEmailIncorrecto implements Question<Boolean> {

    private Target msnControl;

    public ValidarMensajeEmailIncorrecto(Target msnControl) {
        this.msnControl = msnControl;
    }

    public static ValidarMensajeEmailIncorrecto conTarget(Target msnControl){
        return new ValidarMensajeEmailIncorrecto(msnControl);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(msnControl).answeredBy(actor).booleanValue();
    }
}
