Feature: Homepage Functionality

  @Smoke

  Scenario: Search Box Functionality

    Given User is in the hompage of iceland website
    When User types an item in the search box
    Then User should be able to see all the products related to the item

    @Regression

    Scenario Outline: Multiple Products Functionality

      Given User is in the hompage of iceland website
      When User types "<products>" in the search box
      Then User should be able to see all the products related to the items
      Examples:
      |products|
      |biscuits|
      |crisps  |


      @SouthallCalender

      Scenario: Test calender is clicking or not

        Given User is in the homepage of Southall website
        When User clicks on departure calender
        Then User should be able to all the dates
        And User should be able to click on one particular date