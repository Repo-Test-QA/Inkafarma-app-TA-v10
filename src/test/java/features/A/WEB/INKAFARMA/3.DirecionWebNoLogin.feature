#Author: alexcgp94@gmail.com
Feature:   Registrar direccion en el site de InkaFarma

  Background:  Precondiciones
    Given El site de Inkafarma esta habilitado y se muestra el logo de Inkafarma

  @WEB2 @W03
  Scenario Outline: Como usuario no registrado quiero registrar mi direccion para realizar compras más adelante
    And  Selecciono la opción de ubicacion y me redirecciona una pantalla de direciones
    And  Elijo la opcion de agregar nueva direccion
    And  Ingreso todo los campos obligatorios <Distrito>, <Tipo_Via>, <Nombre_Via>, <Numero_Via>, <Depart>, <Referencia>, <Nombre_Lugar>, <Nombre_Personalizado>
    When Selecciono boton continuar
    And  Selecciono boton confirmar
    And  Selecciono boton aceptar
    Then Se muestra la pantalla si deseo cambiar mi direccion y elijo no
    And   Ingreso un producto en el buscador <Producto> y presiono enter
    And   Luego selecciono el carrito de compras
    When  Selecciono el boton comprar
    Then  Se muestra la pantalla de inicion de session elegimos iniciar sin cuenta
    And   Ingreso mis datos obligatorios <Nombres>, <Numero>, <Email>
    And   Selecciono el boton de continuar
    And   Ingreso un horario para mi pedido
    And   Elijo un medio de pago <Medio_Pago>
    When  Selecciono confirmar pedido

    Examples:
      |  Distrito  | Tipo_Via |    Nombre_Via     | Numero_Via |  Depart | Referencia | Nombre_Lugar | Nombre_Personalizado |      Nombres      |   Numero   |        Email        |       Medio_Pago         |Producto    |
      |  Barranco  |  Jirón   |   Miguel Grau     |  201   |   10    |  Prueba    |     Otro     |  INKATRACKER LITE    | Alexander Garcia  |  957281145 | alexcgp94@gmail.com |     Débito/crédito       |    jar    |
#      |  Barranco  |  Jirón   |   Miguel Grau     |  201   |   10    |  Prueba    |     Otro     |  INKATRACKER LITE    | Alexander Garcia  |  957281145 | alexcgp94@gmail.com |     Débito/crédito       |    jar    |
#      |  Barranco  |  Jirón   |   Miguel Grau     |  201   |   10    |  Prueba    |     Otro     |  INKATRACKER LITE    | Alexander Garcia  |  957281145 | alexcgp94@gmail.com |     Débito/crédito       |    jar    |
#      |  Barranco  |  Jirón   |   Miguel Grau     |  201   |   10    |  Prueba    |     Otro     |  INKATRACKER LITE    | Alexander Garcia  |  957281145 | alexcgp94@gmail.com |     Débito/crédito       |    jar    |
#      |  Barranco  |  Jirón   |   Miguel Grau     |  201   |   10    |  Prueba    |     Otro     |  INKATRACKER LITE    | Alexander Garcia  |  957281145 | alexcgp94@gmail.com |     Débito/crédito       |    jar    |
##      |  San Borja | Avenida  |     Aviación      |  2425  |   10    |  Prueba    |     Otro     |     INKATRACKER      |Débito/crédito     Visa débito/crédito

