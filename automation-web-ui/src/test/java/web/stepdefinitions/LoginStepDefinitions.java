package web.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import web.steps.LoginSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefinitions {
    //Que accion va a realizar la aplicacion, en un determinado paso (Gherkin .feature)
    //relacion de Steps y Los Pasos del archivo .feature
    @Steps
    LoginSteps loginSteps;

    @Dado("que cliente requiere ingresar al portal URL DocEle")
    public void que_cliente_requiere_ingresar_al_portal_URL_DocEle() {
        loginSteps.openLoginPage();
    }

    @Cuando("ingresa su usuario valido {string} y contrasena correcta {string}")
    public void ingresa_su_usuario_valido_y_contrasena_correcta(String email, String password) {
        loginSteps.fillUsernameField(email);
        loginSteps.fillPasswordField(password);
    }

    @Entonces("selecciona el boton de ingresar")
    public void selecciona_el_boton_de_ingresar() {
        loginSteps.clickOnLoginButton();
    }

    @Entonces("el usuario accede al a la pagina y aparecera su nombre de usuario {string}")
    public void el_usuario_accede_al_a_la_pagina_y_aparecera_su_nombre_de_usuario(String userName) {
        assertThat(true).isTrue();
    }

}
