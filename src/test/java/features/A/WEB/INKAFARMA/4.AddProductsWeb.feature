#Author: alexcgp94@gmail.com
Feature:    Ingresar al site de Inkafarma y realizar una compra como usuario no regitrado
  @web @W04
  Scenario Outline: Como usuario no registrado quiero realizar una compra en el site de inkafarma
    Given El site de Inkafarma esta habilitado y se muestra el logo de Inkafarma
    And   Ingreso un producto en el buscador <Producto> y presiono enter
    And   Agrego uno o varios productos <Producto1>, <Producto2>, <Producto3>
    And   Luego selecciono el carrito de compras
    When  Selecciono el boton comprar
    Then  Se muestra la pantalla de inicion de session elegimos iniciar sin cuenta
    And   Ingreso mis datos obligatorios <Nombres>, <Numero>, <Email>
    And   Selecciono el boton de continuar
    And   Ingreso un horario para mi pedido
    And   Elijo un medio de pago <Medio_Pago>
    When  Selecciono confirmar pedido

  Examples:
    | Producto    | Producto1 | Producto2 | Producto3 |      Nombres      |   Numero   |        Email        |       Medio_Pago         |
    | paracetamol |  261223   |     |     | Alexander Garcia  |  957281145 | alexcgp94@gmail.com |      Visa débito/crédito      |
#    | paracetamol |  261223   |  324071   |  426322   | Alexander Garcia  |  957281145 | alexcgp94@gmail.com |  Efectivo en Soles (S/)    Débito/crédito        |
#  Medio de Pago: Visa Débito/crédito
#  Medio de Pago: Mastercard Débito/crédito
#  Medio de Pago: Dinners Crédito
#  Medio de Pago: American Express Crédito
#  Medio de Pago: Tarjeta OH! Crédito
#  Medio de Pago: Tarjeta VERITO Crédito
#  Medio de Pago: Débito/crédito
#  Medio de Pago: Débito/crédito
#  Medio de Pago: Crédito
#  Medio de Pago: Visa Débito/crédito
#  Medio de Pago: MasterCard Débito/crédito
#  Medio de Pago: Débito/crédito
#  Medio de Pago: Efectivo En Soles (S/)

