package tasks.Base;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;


public class IngresarTexto implements Interaction {

    private final String textoIngresar;
    private final Target target;

    public IngresarTexto(String textoIngresar, Target target) {
        this.textoIngresar = textoIngresar;
        this.target = target;
    }

    public static IngresarTexto ingresarTexto(String textoIngresar, Target target){
        return new IngresarTexto(textoIngresar, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(textoIngresar).into(target)
        );
    }
}
