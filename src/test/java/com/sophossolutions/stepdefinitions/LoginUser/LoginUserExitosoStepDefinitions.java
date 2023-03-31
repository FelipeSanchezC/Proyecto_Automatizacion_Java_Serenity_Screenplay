package com.sophossolutions.stepdefinitions.LoginUser;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.loginUser.ValidarLogoutLogin;
import tasks.LoginUser.IngresoInformacionLogin;
import userInterface.LoginUser.PaginaIngresoUsuarioUi;
import utilities.LoginUser.MensajesControlLoginUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginUserExitosoStepDefinitions {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @When("Ingreso la informacion solicitada para el Login")
    public void ingresoLaInformacionSolicitadaParaElLogin() {
        theActorInTheSpotlight().wasAbleTo(
                IngresoInformacionLogin.ingresoInformacionLogin()
        );
    }

    @Then("Valido que el login se genere de forma correcta")
    public void validoQueElLoginSeGenereDeFormaCorrecta() {
        theActorInTheSpotlight().should(seeThat(ValidarLogoutLogin.conTarget(PaginaIngresoUsuarioUi.OPCION_LOGOUT), equalTo(true)).
            orComplainWith(MensajesControlLoginUser.class, MensajesControlLoginUser.MSN_CONTROL_INGRESO_EXITOSO));
    }

}
