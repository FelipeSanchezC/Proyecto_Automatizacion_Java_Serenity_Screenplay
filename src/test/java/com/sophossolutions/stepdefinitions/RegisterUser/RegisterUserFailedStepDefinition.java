package com.sophossolutions.stepdefinitions.RegisterUser;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.RegisterUser.ValidateEmailAddressAlreadyExist;
import tasks.RegisterUser.NewUserSingUp;
import userInterface.RegisterUser.NewUserSingUpUi;
import utilities.RegisterUser.Constantes;
import utilities.RegisterUser.Mensajes;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class RegisterUserFailedStepDefinition {

    @Before
    public void setUo(){
        setTheStage(new OnlineCast());
    }

    @When("Realizo un flujo de Register User con correo ya registrado")
    public void realizoUnFlujoDeRegisterUserConCorreoYaRegistrado() {
        theActorInTheSpotlight().attemptsTo(
                NewUserSingUp.newUserSingUpUi()
        );
    }
    @Then("Valido que se presente el mensaje de control por el corroe")
    public void validoQueSePresenteElMensajeDeControlPorElCorroe() {
        theActorInTheSpotlight().should(seeThat(ValidateEmailAddressAlreadyExist.conMensajeDeControl(NewUserSingUpUi.MENSAJE_CONTROL),
                equalTo(Constantes.MENSAJE_CONTROL_EMAIL)).orComplainWith(Mensajes.class, Mensajes.MSG_ERROR_REGISTER_USER));
    }

}
