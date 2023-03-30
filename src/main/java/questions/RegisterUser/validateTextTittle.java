package questions.RegisterUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import userInterface.RegisterUser.PageRegisterUserUi;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class validateTextTittle implements Question<String> {

    private Target target;

    public validateTextTittle(Target target) {
        this.target = target;
    }

    public static validateTextTittle conTarget(Target target){
        return new validateTextTittle(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PageRegisterUserUi.TITTLE).answeredBy(actor).toString();
    }
}
