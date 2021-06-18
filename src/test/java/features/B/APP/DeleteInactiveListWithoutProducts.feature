# Autor: gsarmiento

@appium3 @A05
Feature:  Delete inactive list without products

  Background:
    Given Victoria is logged into the inkarma app
    And   she is in the inactive lists tab

  Scenario Outline: Remove inactive list without products
    When  she selects the inactive list
      |  <inactive_list>  |
    And   she removes the inactive list
    Then  she should not display the inactive list deleted in the inactive lists
      |  <inactive_list_deleted>  |

    Examples:
      |  inactive_list  |  inactive_list_deleted  |
      |  Test AT 153    |  Test AT 153            |
      #|  Test AT 153    |  Test AT 153            |