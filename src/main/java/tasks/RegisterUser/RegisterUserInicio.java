package tasks.RegisterUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.RegisterUser.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserInicio implements Task {


    public static  RegisterUserInicio inicioRegistro () {
        return instrumented(RegisterUserInicio.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_SING_UP)
        );
    }
}
