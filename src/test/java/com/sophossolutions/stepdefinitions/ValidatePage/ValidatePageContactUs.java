package com.sophossolutions.stepdefinitions.ValidatePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidatePages.ValidateTittlePage;
import tasks.ValidatePages.FuncionamientoPageContactUs;
import tasks.ValidatePages.IngresoPageContactUs;
import userInterface.RegisterUser.HomePage;
import userInterface.ValidaPages.PageContactUsUi;
import utilities.RegisterUser.Constantes;
import utilities.RegisterUser.Mensajes;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class ValidatePageContactUs {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("ingreso a la pagina que se empleara para pruebas opcion de Contact us")
    public void ingresoALaPaginaQueSeEmplearaParaPruebasOpcionDeContactUs() {
        theActor(Constantes.ACTOR_NAME).wasAbleTo(Open.browserOn(new HomePage()));
        theActorInTheSpotlight().attemptsTo(IngresoPageContactUs.IngresoContactUs());
    }
    @When("realizo la validacion de las funcionalidades de la pagina")
    public void realizoLaValidacionDeLasFuncionalidadesDeLaPagina() {
        theActorInTheSpotlight().should(seeThat(ValidateTittlePage.conTittleGetInTouch(PageContactUsUi.TITTLE_GET_IN_TOUCH), equalTo(true))
                .orComplainWith(Mensajes.class, Mensajes.MSG_ERROR_REGISTER_USER)
        );

        theActorInTheSpotlight().attemptsTo(
                FuncionamientoPageContactUs.formulario()
        );
    }

    @Then("Verifico que no se presenten errores en el flujo")
    public void verificoQueNoSePresentenErroresEnElFlujo() {

    }
}
