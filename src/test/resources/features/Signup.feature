Feature: user should be able to navigate to the site and  register on  the site.

  Scenario: User should be able to login successfully.
    Given I navigate to the site with valid url
    When I  fill all required details
    And I submit request
    Then User is registered succesfully
    And User is able to login
