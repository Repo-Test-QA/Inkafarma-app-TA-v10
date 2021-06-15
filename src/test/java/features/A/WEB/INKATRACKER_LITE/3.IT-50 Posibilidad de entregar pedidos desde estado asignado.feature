@WEb @IT50
Feature: Posibilidad de entregar pedidos desde el estado "asignado"
  """
  Como usuario supervisor del equipo de operaciones, quiero poder cambiar los pedidos a estado "entregado" desde que se encuentranen estado "assigned",
  de manera que pueda brindar soporte al motorizado cuando por algún motivo no puede entregar un pedido desde InkaMoto Lite.
  """

  @WEb3 @SC03
  Scenario Outline: Como usuario Administrador quiero consultar mis ordenes, además debo visualizar y accionar los botones de "Entregar" y "Cancelar"

   And Me encuentro en el site de FarmaDashboard en el reporte
   And Eligo los filtros <canal>, <estado>, <local>, <fechainicio>, <fechafin>, <comanda>, <telefono>, <dnicl>, <dnitp>
   When Seleciono el boton consultar
   Then El site muestra los resultados
   And Eligo una orden y selecciono el boton de Entregar
   And Elijo otra orden y selecciono el boton Cancelar
   And Seleciono el boton consultar
   Then El resultado de las ordenes se muestra con los ultimos estados y los botones desaparecen
   Examples:
      | canal  | estado      | fechainicio | fechafin   | local | comanda | telefono  | dnicl    | dnitp |
      | 0: null| 2: ASSIGNED | 20/08/2019  | 20/08/2019 |       |         | 957281145 | 71333594 |       |

   @WEB @SC06
   Scenario Outline: Como usuario Operador quiero consultar mis ordenes,pero no debo visualizar los botones de "Entregar" y "Cancelar"

   And Me encuentro en el site de FarmaDashboard en el reporte
   And Eligo los filtros <canal>, <estado>, <local>, <fechainicio>, <fechafin>, <comanda>, <telefono>, <dnicl>, <dnitp>
   When Seleciono el boton consultar
   Then El site muestra los resultados y los botones de Entregar y Cancelar no se muestran
   Examples:
      | canal | estado      | fechainicio | fechafin   | local | comanda | telefono | dnicl    | dnitp |
      | 0: null| 2: ASSIGNED | 01/06/2019  | 07/06/2019 |       |         |          | 71333594 |       |


