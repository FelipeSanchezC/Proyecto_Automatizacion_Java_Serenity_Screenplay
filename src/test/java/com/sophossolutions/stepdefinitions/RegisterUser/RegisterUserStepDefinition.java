package com.sophossolutions.stepdefinitions.RegisterUser;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.RegisterUser.validateTextTittle;
import tasks.RegisterUser.AccountInformation;
import tasks.RegisterUser.NewUserSingUp;
import tasks.RegisterUser.RegisterUserInicio;
import userInterface.RegisterUser.HomePage;
import userInterface.RegisterUser.PageRegisterUserUi;
import utilities.RegisterUser.Constantes;
import utilities.RegisterUser.Mensajes;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class RegisterUserStepDefinition {
    @Before
    public void setUo(){
        setTheStage(new OnlineCast());
    }

    @Given("Ingreso a la pagina que se empleara para pruebas")
    public void ingreso_a_la_pagina_que_se_empleara_para_pruebas() {
        theActorCalled(Constantes.ACTOR_NAME).wasAbleTo(Open.browserOn(new HomePage()));
        theActorInTheSpotlight().attemptsTo(
                RegisterUserInicio.inicioRegistro()
        );
    }


    @When("Realizo un flujo de Register User")
    public void realizo_un_flujo_de_register_user() {
        theActorInTheSpotlight().attemptsTo(
                NewUserSingUp.newUserSingUpUi(),
                AccountInformation.accountInformation()
        );
    }


    @Then("Valido que l usuario quede registrado de forma correcta")
    public void valido_que_l_usuario_quede_registrado_de_forma_correcta() {
        theActorInTheSpotlight().should(seeThat(validateTextTittle.conTarget(PageRegisterUserUi.TITTLE),
        equalTo(Constantes.TITTLE_CREATE_USER)).orComplainWith(Mensajes.class, Mensajes.MSG_ERROR_REGISTER_USER));
    }
}
