# Autor: gsarmiento

#@appium3 @A03
Feature:  Generate inactive list

  Background:
    Given Victoria is logged into the inkarma app
    And   she is in the inactive lists tab

  Scenario Outline: Add Product To Inactive list
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