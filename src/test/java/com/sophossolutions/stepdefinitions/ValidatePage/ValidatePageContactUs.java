package com.sophossolutions.stepdefinitions.ValidatePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import userInterface.RegisterUser.HomePage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidatePageContactUs {


    @Given("ingreso a la pagina que se empleara para pruebas opcion de Contact us")
    public void ingresoALaPaginaQueSeEmplearaParaPruebasOpcionDeContactUs() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new HomePage()));
        theActorInTheSpotlight().attemptsTo(

        );
    }
    @When("realizo la validacion de las funcionalidades de la pagina")
    public void realizoLaValidacionDeLasFuncionalidadesDeLaPagina() {

    }
    @Then("Verifico que no se presenten errores en el flujo")
    public void verificoQueNoSePresentenErroresEnElFlujo() {

    }
}
