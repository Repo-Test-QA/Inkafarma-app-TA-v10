# Autor: gsarmiento

#@appium3 @A04
Feature:  Add product to inactive list

  Background:
    Given Victoria is logged into the inkarma app
    And   she is in the inactive lists tab

  Scenario Outline: Assign product to inactive list
    When  she accesses the inactive list
    And   she adds the <product> to the inactive list
    Then  she should see the confirmation message
      """
            Se agregó correctamente a tu
            lista. Ver lista
      """

    Examples:
      |  product  |
      |  Elvive   |