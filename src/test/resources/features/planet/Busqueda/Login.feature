@Busqueda
Feature: Login Planet
	Acceso a internet
	Tener Usuarios con permisos de ingreso
	No tener restricciones de red para el aplicativo Planet

  @RutaCritica
  Scenario: Login correcto
    Given Ingreso a URL planet
    When Ingresar usuario "scoronado"
    And Ingresar contrasenia "Colombia123."
    And Presionar el botón ingresar
    Then Aparece el portal de planet
    
  @SmokeTest
  Scenario Outline: Prueba Login
    Given Ingreso a URL planet
    When Ingresar usuario <usuario>
    And Ingresar contrasenia <contrasena>
    And Presionar el botón ingresar
    Then Aparece popup con mensaje de alerta por usuario incorrecto
    
    Examples:
			| usuario | contrasena |
			| "scoronado" | "Colombia123." |
			| "scoronhado" | "Colombia123." |