#Author: alexcgp94@gmail.com
Feature:   Registrar direccion en el site

  Background:  Precondiciones
    Given El site de Inkafarma esta habilitado y se muestra el logo de Inkafarma
    #colocar el usuario correcto de tu cuenta logeada en el site de inkafarma
    And   Mi usuario debe estar logeado en el site
          """
          Alexander
          """

#  @web @W02
#  Scenario Outline: Como usuario quiero registrar mi direccion para realizar compras más adelante
#    And Selecciono la opción de ubicacion y me redirecciona a una pantalla de direciones
#    And
#    And
#    Examples:
#      |  Distrito  | Tipo_Via |    Nombre_Via     | Numero |  Depart | Referencia | Nombre_Lugar | Nombre_Personalizado |
#      |  Barranco  |  Jirón   |   Miguel Grau     |  201   |   10    |  Prueba    |     Otro     |  INKATRACKER LITE    |
##      |  Barranco  |  Jirón   |   Miguel Grau     |  201   |   10    |  Prueba    |     Otro     |     INKATRACKER      |
#
