package com.bcs.test.steps;

import com.bcs.test.pageObjects.LoginPageObject;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPageObject LoginPageObject;
	
	@Step
	public void ClickBotonIngresar() {
		// TODO Auto-generated method stub
		LoginPageObject.ClickIngresar();
	}

	@Step
	public void Browser() {
		// TODO Auto-generated method stub
		LoginPageObject.open();
	}

	@Step
	public void IngresoUsuario(String usuario) {
		// TODO Auto-generated method stub
		LoginPageObject.InputUsuario(usuario);
	}

	@Step
	public void IngresoContrasenia(String contrasenia) {
		// TODO Auto-generated method stub
		LoginPageObject.InputContrasenia(contrasenia);
	}

	@Step
	public void IngresoPortalPlanet() {
		// TODO Auto-generated method stub
		LoginPageObject.IngresoPortal();
	}

}
