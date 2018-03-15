package com.bcs.test.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;

@DefaultUrl("http://planet.choucairtesting.com/bin/login/Main/WebHome?origurl=/")
public class LoginPageObject extends PageObject{
	String strUsuario = "//INPUT[@tabindex='1']/self::INPUT";
	String strConstrasenia = "//INPUT[@tabindex='2']/self::INPUT";
	String strIngresar = "//INPUT[@tabindex='4']/self::INPUT";
	String strMensaje  = "//DIV[@class='patternLeftBarPersonal']/self::DIV";
	String strMenu = "Sandra Gineth Coronado Aldana";
	
	public void openB() {
		// TODO Auto-generated method stub
		
	}

	public void InputUsuario(String usuario) {
		// TODO Auto-generated method stub
		find(By.xpath(strUsuario)).sendKeys(usuario);
	}

	public void InputContrasenia(String contrasenia) {
		// TODO Auto-generated method stub
		find(By.xpath(strConstrasenia)).sendKeys(contrasenia);
		Robot fefe;
		try {
			fefe = new Robot();
			fefe.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void IngresoPortal() {
		// TODO Auto-generated method stub
		if(strMenu.equals(findBy(strMensaje).getText().trim())) {
			System.out.println("Login Exitoso");
		}
		else {
			System.out.println("Login No Exitoso");
		}
	}

	public void ClickIngresar() {
		// TODO Auto-generated method stub
		find(By.xpath(strIngresar)).click();
	}

}
