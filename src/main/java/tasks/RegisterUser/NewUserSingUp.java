package tasks.RegisterUser;

import Configuracion.CargaDeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.RegisterUser.NewUserSingUpUi;
import utilities.RegisterUser.Constantes;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NewUserSingUp implements Task {

    private String userName = CargaDeData.getValue("USER_NAME_REGISTRO");
    private String userEmail = CargaDeData.getValue("USER_EMAIL_REGISTRO");

    public static NewUserSingUp newUserSingUpUi () {
        return instrumented(NewUserSingUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Enter.keyValues(Constantes.USER_NAME).into(NewUserSingUpUi.INPUT_NAME),
                Enter.keyValues(userName).into(NewUserSingUpUi.INPUT_NAME),
                //Enter.keyValues(Constantes.USER_EMAIL).into(NewUserSingUpUi.INPUT_EMAIL),
                Enter.keyValues(userEmail).into(NewUserSingUpUi.INPUT_EMAIL),
                Click.on(NewUserSingUpUi.BTN_SIGUP)
        );
    }
}
