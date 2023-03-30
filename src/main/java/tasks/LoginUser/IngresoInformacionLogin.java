package tasks.LoginUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.LoginUser.PageLoginAccountUi;
import utilities.LoginUser.ConstantesLoginUser;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresoInformacionLogin implements Task {


    public static IngresoInformacionLogin ingresoInformacionLogin () {
        return instrumented(IngresoInformacionLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(ConstantesLoginUser.EMAIL_ADRESS_CORRECT).into(PageLoginAccountUi.INPUT_EMAIL),
                Enter.keyValues(ConstantesLoginUser.PASS_WORD).into(PageLoginAccountUi.INPUT_PASSWORD),
                Click.on(PageLoginAccountUi.BTN_LOGIN)
        );
    }
}
