package com.bcs.test.definition;

import com.bcs.test.steps.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition{
	
	@Steps
	LoginSteps LoginSteps;
	
	@Given("^Ingreso a URL planet$")
	public void ingreso_a_URL_planet() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Browser();
	}

	
	
	@When("^Ingresar usuario \"([^\"]*)\"$")
	public void ingresar_usuario(String usuario) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.IngresoUsuario(usuario);
	}

	@When("^Ingresar contrasenia \"([^\"]*)\"$")
	public void ingresar_contrasenia(String contrasenia) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.IngresoContrasenia(contrasenia);
	}

	@When("^Presionar el botón ingresar$")
	public void presionar_el_botón_ingresar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.ClickBotonIngresar();
	}

	@Then("^Aparece el portal de planet$")
	public void aparece_el_portal_de_planet() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.IngresoPortalPlanet();
	}
	
	@Then("^Aparece popup con mensaje de alerta por usuario incorrecto$")
	public void aparece_popup_con_mensaje_de_alerta_por_usuario_incorrecto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
