@appium3 @A04
Feature:  delete inactive list

  Background:
    Given Victoria is logged into the inkarma app
    And   she is in the inactive lists tab

  Scenario Outline: Remove inactive List
    When  she selects the <inactive_list>
    And   she removes the inactive list
    Then  she should not display the <delete_list> in the inactive lists

    Examples:
      |  inactive_list  |  delete_list  |
      |  Test AT 87     |  Test AT 87   |