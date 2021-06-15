#Author: alexcgp94@gmail.com
Feature: Login - Ingresar con mi cuenta de gmail en la aplicacion de inkafarma

  @appium1 @A01
  Scenario Outline: Como usuario quiero ingresar con mi cuenta de google al aplicativo de inkafarma para visualizar los productos
    Given Victoria is logged into the inkarma app
    And   Selecciono la opcion de ingresar con Google, elijo mi correo electronico y luego ingreso mi numero de celular <numero>
    When  Selecciono el boton continuar
    And   Aceptamos el boton de conformidad de mi numero ingresado
    Then  Se muestra la pantalla de codigo de validacion y esperamos a que el aplicativo continue con la siguiente pantalla
    And   Ingresamos todos los campos obligatorios <nombres>, <apellidos>, <email>, <dni> y aceptamos los Terminos y Condiciones, asimismo las politicas de privacidad
    When  Selecciono el boton siguiente
    Then  Se muestra la pantalla del Hompe principal de inkafarma

    Examples:
      |    numero   |      nombres      |     apellidos     |        email        |     dni     |
      |  957281145  |  Alexander Claude |  Garcia Palacios  | alexcgp94@gmail.com |   71333594  |

