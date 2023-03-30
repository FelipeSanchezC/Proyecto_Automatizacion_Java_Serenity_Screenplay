package com.sophossolutions.stepdefinitions.LoginUser;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.loginUser.ValidarTituloLogaut;
import tasks.LoginUser.LogoutSesion;
import userInterface.LoginUser.PageLoginAccountUi;
import utilities.LoginUser.MensajesControlLoginUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LogoutSessionUser {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }


    @When("Realizo el login en la pagina con las credenciales correctas")
    public void realizoElLoginEnLaPaginaConLasCredencialesCorrectas() {
        theActorInTheSpotlight().attemptsTo(
                LogoutSesion.logoutSesion()
        );
    }

    @Then("Valido que permita realizar el logaut")
    public void validoQuePermitaRealizarElLogaut() {
        theActorInTheSpotlight().should(seeThat(ValidarTituloLogaut.conTitulo(PageLoginAccountUi.TITULO_LOGIN_ACCOUNT),
                equalTo(true)).orComplainWith(MensajesControlLoginUser.class, MensajesControlLoginUser.MSN_CONTROL_INGRESO_EXITOSO));
    }
}
