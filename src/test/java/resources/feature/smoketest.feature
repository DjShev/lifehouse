Feature: Create customer


  @smoketest
  Scenario: create new customer
    Given open main page
    And enter email and press join now button
    Then verify that user redirected to main page