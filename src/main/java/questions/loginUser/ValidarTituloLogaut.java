package questions.loginUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarTituloLogaut implements Question<Boolean> {

    private Target tituloLogout;

    public ValidarTituloLogaut(Target tituloLogout) {
        this.tituloLogout = tituloLogout;
    }

    public static ValidarTituloLogaut conTitulo(Target tituloLogout){
        return new ValidarTituloLogaut(tituloLogout);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(tituloLogout).answeredBy(actor).booleanValue();
    }
}
