package questions.ValidatePages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import userInterface.ValidaPages.PageContactUsUi;

public class ValidateTittlePage implements Question <Boolean> {

    private Target TituloGetInTouch;

    public ValidateTittlePage(Target tituloGetInTouch) {
        TituloGetInTouch = tituloGetInTouch;
    }

    public static ValidateTittlePage conTittleGetInTouch (Target TituloGetInTouch) {
        return new ValidateTittlePage(TituloGetInTouch);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(TituloGetInTouch).answeredBy(actor).booleanValue();
    }
}
