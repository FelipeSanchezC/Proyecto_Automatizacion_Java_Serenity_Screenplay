package tasks.RegisterUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.support.ui.Select;
import userInterface.RegisterUser.AccountInformationUi;
import utilities.RegisterUser.Constantes;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccountInformation implements Task {


    public static AccountInformation accountInformation () {
        return instrumented(AccountInformation.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccountInformationUi.RADIO_BTN_TITTLE),
                Enter.keyValues(Constantes.PASS_WORD).into(AccountInformationUi.INPUT_PASSWORD),
                Click.on(AccountInformationUi.DROP_DOWN_DAY), SelectFromOptions.byValue("15").from(AccountInformationUi.DROP_DOWN_DAY),
                Click.on(AccountInformationUi.DROP_DOWN_MONTH), SelectFromOptions.byValue("12").from(AccountInformationUi.DROP_DOWN_MONTH),
                Click.on(AccountInformationUi.DROP_DOWN_YEAR), SelectFromOptions.byValue("1996").from(AccountInformationUi.DROP_DOWN_YEAR),
                Scroll.to(AccountInformationUi.INPUT_FIRST_NAME),
                Enter.keyValues(Constantes.FIRTSNAME).into(AccountInformationUi.INPUT_FIRST_NAME),
                Enter.keyValues(Constantes.LASTNAME).into(AccountInformationUi.INPUT_LAST_NAME),
                Enter.keyValues(Constantes.ADRESS).into(AccountInformationUi.INPUT_ADDRESS),
                Click.on(AccountInformationUi.SELECT_COUNTRY), SelectFromOptions.byValue("Canada").from(AccountInformationUi.SELECT_COUNTRY),
                Scroll.to(AccountInformationUi.INPUT_STATE),
                Enter.keyValues(Constantes.STATE).into(AccountInformationUi.INPUT_STATE),
                Enter.keyValues(Constantes.CITY).into(AccountInformationUi.INPUT_CITY),
                Enter.keyValues(Constantes.ZIPCODE).into(AccountInformationUi.INPUT_ZIPCODE),
                Enter.keyValues(Constantes.MOBILE_NUMBER).into(AccountInformationUi.INPUT_MOBILE_NUMBER),
                Click.on(AccountInformationUi.BTN_CREATE_ACCOUNT)
        );
    }
}
