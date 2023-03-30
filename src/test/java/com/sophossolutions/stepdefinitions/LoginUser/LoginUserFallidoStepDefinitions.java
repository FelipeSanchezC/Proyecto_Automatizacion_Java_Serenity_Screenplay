package com.sophossolutions.stepdefinitions.LoginUser;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.loginUser.ValidarMensajeEmailIncorrecto;
import tasks.LoginUser.IngresoInfoLoginError;
import userInterface.LoginUser.PageLoginAccountUi;
import utilities.LoginUser.MensajesControlLoginUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginUserFallidoStepDefinitions {

    @Before
    public void SetUp(){
        setTheStage(new OnlineCast());
    }

    @When("Ingreso la informacion solicitada para el Login con correo incorrecto")
    public void ingresoLaInformacionSolicitadaParaElLoginConCorreoIncorrecto() {
        theActorInTheSpotlight().attemptsTo(
                IngresoInfoLoginError.ingresoInfoLoginError()
        );
    }
    @Then("Valido que se genere el mensaje de control")
    public void validoQueSeGenereElMensajeDeControl() {
        theActorInTheSpotlight().should(seeThat(ValidarMensajeEmailIncorrecto.conTarget(PageLoginAccountUi.MENSAJE_CONTROL_EMAIL),
                equalTo(true)).orComplainWith(MensajesControlLoginUser.class, MensajesControlLoginUser.MSN_CONTROL_INGRESO_EXITOSO));
    }
}
