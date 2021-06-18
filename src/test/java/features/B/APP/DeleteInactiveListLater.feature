# Autor: gsarmiento

#@appium3 @A07
Feature:  Delete inactive list later

  Background:
    Given Victoria is logged into the inkarma app
    And   she is in the inactive lists tab

  Scenario Outline: Remove inactive list later
    When  she chooses the inactive list
      |  <inactive_list_to_remove>  |
    And   she decides to delete the list at another time
    Then  she should visualize the inactive list
      |  <inactive_list_enabled>  |

    Examples:
      |  inactive_list_to_remove  |  inactive_list_enabled  |
      |  Test AT 144              |  Test AT 144            |
      |  Test AT 146              |  Test AT 146            |