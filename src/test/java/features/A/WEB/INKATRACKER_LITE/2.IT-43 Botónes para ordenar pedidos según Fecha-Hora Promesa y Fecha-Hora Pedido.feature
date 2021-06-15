@WEB @IT43
Feature: Botónes para ordenar pedidos según Fecha-Hora Promesa y Fecha-Hora Pedido
  """
  El equipo de Operaciones y Call Center utilizan el FarmaDashboard para hacer seguimiento de las entregas de pedidos.
  Es conveniente, para hacer más eficaz el control, poder ordenar los pedidos según su fecha y hora prometida para la entrega.
  """

  @WEB3 @SC02
  Scenario Outline: Como usuario Administrador u Operador quiero consultar mis ordenes y realizar el filtro por Fecha-Hora Promesa

    And Me encuentro en el site de FarmaDashboard en el reporte
    And Eligo los filtros <canal>, <estado>, <local>, <fechainicio>, <fechafin>, <comanda>, <telefono>, <dnicl>, <dnitp>
    When Seleciono el boton consultar
    Then El site muestra los resultados
    And Hago click sobre el filtro Fecha-Hora Promesa
    Then El resultado de las ordenes se muestra en forma descendete por Fecha-Hora Promesa
    Examples:
       | canal  | estado | fechainicio | fechafin   | local | comanda | telefono | dnicl | dnitp |
       | 0: null|        | 20/08/2019  | 20/08/2019 |       |         |          |       |       |

  @WEB @SC05
  Scenario Outline: Como usuario Administrador u Operador quiero consultar mis ordenes y realizar el filtro por Fecha-Hora Pedido

    And Me encuentro en el site de FarmaDashboard en el reporte
    And Eligo los filtros <canal>, <estado>, <local>, <fechainicio>, <fechafin>, <comanda>, <telefono>, <dnicl>, <dnitp>
    When Seleciono el boton consultar
    Then El site muestra los resultados
    And Hago click sobre el filtro Fecha-Hora Pedido
    Then El resultado de las ordenes se muestra en forma descendete por Fecha-Hora Pedido
    Examples:
      | canal   | estado      | fechainicio | fechafin   | local  | comanda | telefono | dnicl | dnitp |
      | 0: null | 7: ON_STORE | 20/08/2019  | 07/06/2019 | 34: 36 |         |          |       |       |
