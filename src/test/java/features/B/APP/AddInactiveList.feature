# Autor: gsarmiento

#@appium3 @A03
Feature:  Add inactive list

  Background:
    Given Victoria is logged into the inkarma app

  Scenario Outline: Generate inactive list
    When  she accesses the option my lists
    And   she enters a frequent list
      |  <frequent_list>  |
    Then  she should visualize the screen your list is created
    And   she should see the inactive list created
      |  <inactive_list_created>  |

    Examples:
      |  frequent_list  |  inactive_list_created  |
      |  Test AT 151    |  Test AT 152            |
    #  |  Test AT 145    |  Test AT 145            |
    # |  Test AT 142    |  Test AT 142            |
    # |  Test AT 143    |  Test AT 143            |
    # |  Test AT 132    |  Test AT 132            |