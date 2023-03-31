package tasks.ValidatePages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import tasks.Base.IngresarTexto;
import utilities.ValidatePages.dataPageContactUs;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FuncionamientoPageContactUs implements Task {

    private final dataPageContactUs data;

    public FuncionamientoPageContactUs(dataPageContactUs data) {
        this.data = data;
    }

    public static FuncionamientoPageContactUs formulario() {
        return instrumented(FuncionamientoPageContactUs.class, dataPageContactUs.dataFormulario());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarTexto.ingresarTexto(data.nameText, data.targetName),
                IngresarTexto.ingresarTexto(data.emailText, data.targetEmail),
                IngresarTexto.ingresarTexto(data.subjectText, data.targetSubject),
                IngresarTexto.ingresarTexto(data.msnText, data.targetMessage)
        );
    }
}
