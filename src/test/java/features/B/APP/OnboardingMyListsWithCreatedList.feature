#Autor: gsarmiento

@appium9 @A09
Feature:  Onboarding the subscription service my lists with created list

  Background:
    Given victoria ingresa a la app Inkafarma
    And   victoria debe estar logueada en la app Inkafarma

  Scenario: Entering the section my programmed lists with created lists
    When  she selected the option my list
    Then  she should see the my lists screen and the programmed tab with her list
    And   she should visualize an icon and description
    And   she should see details of the delivery date


  Scenario: Entering the section my inactive lists with created lists
    When  she chooses the option my list
    Then  she should see the my lists screen and the inactive tab with her list
    And   she should visualize an icon and description