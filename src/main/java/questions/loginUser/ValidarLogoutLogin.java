package questions.loginUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarLogoutLogin implements Question<Boolean> {

    private Target logout;

    public ValidarLogoutLogin(Target logout) {
        this.logout = logout;
    }

    public static ValidarLogoutLogin conTarget(Target logout){
        return new ValidarLogoutLogin(logout);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(logout).answeredBy(actor).booleanValue();
    }
}
