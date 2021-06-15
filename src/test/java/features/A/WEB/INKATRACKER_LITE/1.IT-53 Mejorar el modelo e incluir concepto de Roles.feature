@WEB3 @IT-53
Feature: Mejorar el modelo e incluir concepto de Roles
  """
  Como supervisor del equipo de operaciones deseo refinar el modelo de perfiles de usuario de Farma Dashboard
  de manera que incluya el concepto de "Roles". Así un usuario puede tener un rol y perfiles diferentes,
  de manera que se pueda controlar mejor el acceso a la información
  """
  Background: El site de Farma Dashboard debe estar habilitado en el ambiente de QA
    Given El site de Farma Dashboard esta habilitado


  @WEB3 @SC01
  Scenario: Como usuario Administrador quiero ingresar al site de Farma Dashboard

    And El site de Farma Dashboard esta habilitado ingreso mi usuario y password
        | otorres@farmaciasperuanas.pe   | 123456 |
    When Selecciono el botón INGRESAR
    Then Se muestra la pantalla principal del Farma Dashboard

  @web @SC04
  Scenario: Como usuario Operador quiero ingresar al site de Farma Dashboard

    And El site de Farma Dashboard esta habilitado ingreso mi usuario y el password
        | operador@inkafarmadigital.pe | 123456 |
    When Selecciono el botón INGRESAR
    Then Se muestra la pantalla principal del Farma Dashboard


