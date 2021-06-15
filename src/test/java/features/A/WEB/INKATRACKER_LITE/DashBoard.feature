Feature: Consultar Reporteria de Inkatracker

#  @web @SC01
  Scenario:  Como usuario quiero consultar mis ordenes en el site de reportes de inkatracker para dar seguimiento a las ordenes
#    Given El site de FarmaDashboard esta habilitado ingreso mi usuario y password

#  @web @SC02
  Scenario Outline: Como usuario quiero consultar mis ordenes
    Given Me encuentro en el site de FarmaDashboard en el reporte
    And   Eligo los filtros <canal>, <estado>, <local>, <fechainicio>, <fechafin>, <comanda>, <telefono>, <dnicl>, <dnitp>
    When  Seleciono el boton consultar
    Then  El site muestra los resultados
    Examples:
    |  canal |       estado       | fechainicio |   fechafin  |   local   |  comanda  |  telefono   |   dnicl   |   dnitp   |
    |        |                    |  01/07/2019 | 06/07/2019  |           |           |             |           |           |
    | 2: CALL|   7: ON_STORE      |  01/07/2019 | 06/07/2019  |   34: 36  |           |             |           |           |
#    | 2: CALL|                    |  27/06/2019 | 30/06/2019  |  10: 10  |           |             |           |           |
#    | 1: APP |  3: CANCELLED      |  27/06/2019 | 30/06/2019  |   4: 4   |   11321   |  933993571  |           |           |
#    | 4: WEB |                    |  28/06/2019 | 30/06/2019  |          |   50047   |  987329357  | 42216210  |           |
#    | 3: IOS |  5: HAVE_TRANSFER  |  27/06/2019 | 30/06/2019  |   5: 5   |           |             |           |           |
#    | 1: APP |  6: ON_ROUTE       |  27/06/2019 | 30/06/2019  |   6: 6   |           |             |           |           |
                     #   |  7: ON_STORE       |
                     #   |  8: PACKING        |
                     #   |  9: PICKING        |
                     #   |  10: PREPARED      |
                     #   |  11: REJECTED      |
                     #   |  12: SCHEDULED     |
                     #   |  13: TRANSFERRED   |






