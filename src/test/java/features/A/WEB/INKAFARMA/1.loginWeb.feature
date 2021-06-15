#Author: alexcgp94@gmail.com
Feature:    Ingresar al site de Inkafarma
  @WEB01 @W001
  Scenario Outline: Como usuario quiero ingresar al site de inkafarma con mi correo electronico
    Given El site de Inkafarma esta habilitado y se muestra el logo de Inkafarma
    And   Selecciono la opción de ingresar y me redirecciona a una pantalla de Bienvenida
    When  Eligo la opción de ingresar con Google
    Then  Se abre una ventana nueva donde ingresaremos el usuario <user> y password <pass>
    And   Ingreso mi numero de telefono <numero> y luego ingreso el digito que recibí por mensaje
    And   Ingreso todos los campos obligatorios <nombres>, <apellidos>, <email>, <dni> y aceptamos los Terminos y Condiciones, asimismo las politicas de privacidad
    When  Selecciono boton siguiente
    Then  Debo visualizar mi usuario en el Home de inkafarma
  Examples:
    |     numero     |          user         |        pass     |     nombres      |     apellidos     |        email        |     dni     |
    |   957281145    | alexcgp94@gmail.com   |   9595959595  | Alexander Claude |  Garcia Palacios  | alexcgp94@gmail.com |   71333594  |
