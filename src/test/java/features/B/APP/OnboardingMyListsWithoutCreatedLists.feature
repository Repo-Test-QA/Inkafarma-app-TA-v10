#Autor: gsarmiento

@appium8 @A08
Feature:  Onboarding the subscription service my lists without created lists

  Background:
    Given victoria ingresa al aplicativo Inkafarma
    And   victoria debe estar logueada en la aplicacion

  Scenario: Entering the section my programmed lists without created lists
    When  she selected the option my lists
    Then  she should see my lists screen and the Create a new list button
    And   she should visualize the programmed tab empty
    And   she should see a sad face icon and a message with the text
        """
            ¡Tu lista de compras
           frecuentes está vacía¡
        No olvide crear una lista, y
         agrega tus productos desde
                tipo compra.
        """

  Scenario: Entering the section my inactive lists without created lists
    When  she chooses the option my lists
    Then  she should visualize my lists screen and the Create a new list button
    And   she should see the inactive tab empty
    And   She should visualize a message with the text
        """
        No tienes listas inactivas de
        compras frecuentes disponibles
        """