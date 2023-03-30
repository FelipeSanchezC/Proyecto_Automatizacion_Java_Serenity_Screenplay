package tasks.LoginUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.LoginUser.PageLoginAccountUi;
import userInterface.LoginUser.PaginaIngresoUsuarioUi;
import utilities.LoginUser.ConstantesLoginUser;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogoutSesion implements Task {

    public static LogoutSesion logoutSesion(){
        return instrumented(LogoutSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(ConstantesLoginUser.EMAIL_ADRESS_CORRECT).into(PageLoginAccountUi.INPUT_EMAIL),
                Enter.keyValues(ConstantesLoginUser.PASS_WORD).into(PageLoginAccountUi.INPUT_PASSWORD),
                Click.on(PageLoginAccountUi.BTN_LOGIN),
                WaitUntil.the(PaginaIngresoUsuarioUi.OPCION_LOGOUT, isVisible()), Click.on(PaginaIngresoUsuarioUi.OPCION_LOGOUT),
                WaitUntil.the(PageLoginAccountUi.TITULO_LOGIN_ACCOUNT, isVisible())
        );
    }
}
