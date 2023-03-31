package tasks.ValidatePages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.RegisterUser.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresoPageContactUs implements Task {



    public static IngresoPageContactUs IngresoContactUs () {
        return instrumented(IngresoPageContactUs.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_CONTACT_US)
        );
    }
}
